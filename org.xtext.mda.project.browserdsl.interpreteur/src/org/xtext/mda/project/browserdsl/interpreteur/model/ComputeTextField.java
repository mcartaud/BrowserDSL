package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.CheckValue;
import org.xtext.mda.project.browserDSL.Clear;
import org.xtext.mda.project.browserDSL.Fill;
import org.xtext.mda.project.browserDSL.TextAction;
import org.xtext.mda.project.browserDSL.TextFields;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeTextField {

	private TextFields textField;
	
	public ComputeTextField(TextFields instruction) {
		this.textField = instruction;	
	}
	
	public boolean executeTextFieldAction() throws Exception {
		String id = Utils.getElementId(textField.getId());
		List<WebElement> elements = findGoodElements(id);
		return executeAction(elements);
	}

	private List<WebElement> findGoodElements(String id) {
		List<WebElement> elements = new ArrayList<WebElement>();
		List<WebElement> elementsFound = BrowserDSL.getBrowser().findElements(By.cssSelector("input[type='text']"));
		for (WebElement element : elementsFound) {
			if (element.getAttribute("name").toLowerCase().trim().contains(id.toLowerCase())) {
				elements.add(element);
			}
		}	
		return elements;
	}
	
	private boolean executeAction(List<WebElement> elements) throws Exception {
		TextAction action = textField.getAction();
		if (action instanceof Fill) {
			String value = Utils.getElementId(((Fill) action).getValue());
			element.sendKeys(value);
		} else if (action instanceof Clear) {
			element.clear();
		} else if (action instanceof CheckValue) {
			//TODO
		}
		return false;
	}
	
}
