package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.ButtonAction;
import org.xtext.mda.project.browserDSL.Buttons;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.exceptions.ElementNotFoundException;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeButtons {

	private Buttons buttons;

	public ComputeButtons(Buttons instruction) {
		this.buttons = instruction;
	}

	public void executeButtonsAction() throws Exception {
		List<WebElement> elements = findElements();
		executeAction(elements);
	}

	public boolean executeButtonsBooleanAction() throws Exception {
		List<WebElement> elements = findElements();
		return executeBooleanAction(elements);
	}

	private List<WebElement> findElements() throws Exception {
		List<WebElement> elements;
		String id = Utils.getElementId(buttons.getId());
		if (id != null) {
			elements = findSpecificElements(id);
		} else {
			elements = findAllElements();
		}

		if (elements.size() != 0 || buttons.getAction() instanceof Exist) {
			return elements;
		} else {
			throw new ElementNotFoundException(id);
		}
	}

	private List<WebElement> findSpecificElements(String id) {
		List<WebElement> elements = new ArrayList<WebElement>();
		List<WebElement> elementsFound = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='submit']"));
		for (WebElement element : elementsFound) {
			if (element.getAttribute("value").toLowerCase().trim().contains(id.toLowerCase())) {
				elements.add(element);
			}
		}
		return elements;
	}

	private List<WebElement> findAllElements() {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='submit']"));
		return elements;
	}

	private void executeAction(List<WebElement> elements) {
		for (WebElement element : elements) {
			element.click();
		}
	}

	private boolean executeBooleanAction(List<WebElement> elements) {
		ButtonAction action = buttons.getAction();
		if (action instanceof Exist) {
			if (elements.size() != 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (elements.size() == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

}
