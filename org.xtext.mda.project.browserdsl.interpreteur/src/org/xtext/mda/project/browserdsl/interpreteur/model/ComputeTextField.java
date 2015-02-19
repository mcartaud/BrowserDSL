package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.CheckValue;
import org.xtext.mda.project.browserDSL.Clear;
import org.xtext.mda.project.browserDSL.Fill;
import org.xtext.mda.project.browserDSL.TextAction;
import org.xtext.mda.project.browserDSL.TextField;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeTextField {

	private TextField textField;
	
	public ComputeTextField(TextField instruction) {
		this.textField = instruction;	
	}
	
	public void executeTextFieldAction() throws Exception {
		String id = Utils.getElementId(textField.getId());
		WebElement element = findGoodElement(id);
		executeAction(element);
	}

	private WebElement findGoodElement(String id) {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.name(id));
		for (WebElement element : elements) {
			if (element.getAttribute("name").toLowerCase().trim().contains(id.toLowerCase())) {
				return element;
			}
		}	
		return null;
	}
	
	private void executeAction(WebElement element) throws Exception {
		TextAction action = textField.getAction();
		if (action instanceof Fill) {
			String value = Utils.getElementId(((Fill) action).getValue());
			element.sendKeys(value);
		} else if (action instanceof Clear) {
			element.clear();
		} else if (action instanceof CheckValue) {
			// TODO
		}
	}
	
}
