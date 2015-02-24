package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.CheckValue;
import org.xtext.mda.project.browserDSL.Clear;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserDSL.Fill;
import org.xtext.mda.project.browserDSL.TextAction;
import org.xtext.mda.project.browserDSL.TextFields;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.exceptions.ElementNotFoundException;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeTextFields {

	private TextFields textFields;

	public ComputeTextFields(TextFields instruction) {
		this.textFields = instruction;
	}

	public void executeTextFieldsAction() throws Exception {
		List<WebElement> elements = findElements();
		executeAction(elements);
	}

	public boolean executeTextFieldsBooleanAction() throws Exception {
		List<WebElement> elements = findElements();
		return executeBooleanAction(elements);
	}

	private List<WebElement> findElements() throws Exception {
		List<WebElement> elements;
		String id = Utils.getElementId(textFields.getId());
		if (id != null) {
			elements = findSpecificElements(id);
		} else {
			elements = findAllElements();
		}

		if (elements.size() != 0 || textFields.getAction() instanceof Exist) {
			return elements;
		} else {
			throw new ElementNotFoundException(id);
		}
	}

	private List<WebElement> findSpecificElements(String id) {
		List<WebElement> elements = new ArrayList<WebElement>();
		List<WebElement> elementsFound = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='text']"));
		elementsFound.addAll(BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='password']")));
		for (WebElement element : elementsFound) {
			if (element.getAttribute("name").toLowerCase().trim().contains(id.toLowerCase())) {
				elements.add(element);
			}
		}
		return elements;
	}

	private List<WebElement> findAllElements() {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='text']"));
		elements.addAll(BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='password']")));
		return elements;
	}

	private void executeAction(List<WebElement> elements) throws Exception {
		TextAction action = textFields.getAction();
		if (action instanceof Fill) {
			String value = Utils.getElementValue(((Fill) action).getValue());
			for (WebElement element : elements) {
				element.sendKeys(value);
			}
		} else if (action instanceof Clear) {
			for (WebElement element : elements) {
				element.clear();
			}
		}
	}

	private boolean executeBooleanAction(List<WebElement> elements) throws Exception {
		TextAction action = textFields.getAction();
		if (action instanceof Exist) {
			if (elements.size() != 0) {
				return true;
			} else {
				return false;
			}
		} else if (action instanceof CheckValue){
			for (WebElement element : elements) {
				String value = Utils.getElementValue(((CheckValue) action).getValue());
				if (!(element.getAttribute("value").toLowerCase().trim().equals(value.toLowerCase()))) {
					return false;
				}
			}
			return true;
		} else {
			if (elements.size() == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
}
