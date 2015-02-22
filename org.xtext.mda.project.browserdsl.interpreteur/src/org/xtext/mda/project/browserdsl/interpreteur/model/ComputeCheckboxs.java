package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.CheckboxAction;
import org.xtext.mda.project.browserDSL.Checkboxs;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserDSL.IsCheck;
import org.xtext.mda.project.browserDSL.NotExist;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeCheckboxs {

	private Checkboxs checkboxs;

	public ComputeCheckboxs(Checkboxs instruction) {
		this.checkboxs = instruction;
	}

	public void executeCheckboxsAction() throws Exception {
		List<WebElement> elements = findElements();
		executeAction(elements);
	}

	public boolean executeCheckboxsBooleanAction() throws Exception {
		List<WebElement> elements = findElements();
		return executeBooleanAction(elements);
	}

	private List<WebElement> findElements() throws Exception {
		List<WebElement> elements;
		String id = Utils.getElementId(checkboxs.getId());
		if (id != null) {
			elements = findSpecificElements(id);
		} else {
			elements = findAllElements();
		}

		if (elements.size() != 0 || checkboxs.getAction() instanceof Exist) {
			return elements;
		} else {
			// TODO exception element not found
			throw new Exception();
		}
	}

	private List<WebElement> findSpecificElements(String id) {
		List<WebElement> elements = new ArrayList<WebElement>();
		List<WebElement> elementsFound = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement element : elementsFound) {
			if (element.getAttribute("name").toLowerCase().trim().contains(id.toLowerCase())) {
				elements.add(element);
			}
		}
		return elements;
	}

	private List<WebElement> findAllElements() {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='checkbox']"));
		return elements;
	}

	private void executeAction(List<WebElement> elements) {
		// CheckboxAction action = checkboxs.getAction();
		// if (action instanceof Click) {
		for (WebElement element : elements) {
			element.click();
		}
		// }
		// else{
		// executeBooleanAction(elements);
		// }
	}

	private boolean executeBooleanAction(List<WebElement> elements) {
		CheckboxAction action = checkboxs.getAction();
		if (action instanceof Exist) {
			if (elements.size() != 0) {
				return true;
			} else {
				return false;
			}
		} else if (action instanceof NotExist) {
			if (elements.size() == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			// if (action instanceof IsCheck){
			Boolean value = ((IsCheck) action).getValue().equals(org.xtext.mda.project.browserDSL.Boolean.TRUE) ? true : false;
			for (WebElement element : elements) {
				if ((value == true && !("checked".equals(element.getAttribute("checked")))) || (value == false && ("checked".equals(element.getAttribute("checked"))))) {
					return false;
				}
			}
			return true;
		}
	}

}
