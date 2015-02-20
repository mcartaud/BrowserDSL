package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.CheckboxAction;
import org.xtext.mda.project.browserDSL.Checkboxs;
import org.xtext.mda.project.browserDSL.Clear;
import org.xtext.mda.project.browserDSL.Click;
import org.xtext.mda.project.browserDSL.IsCheck;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeCheckbox {

	private Checkboxs checkbox;
	
	public ComputeCheckbox(Checkboxs instruction) {
		this.checkbox = instruction;
	}
	
	public boolean executeCheckboxAction() throws Exception {
		String id = Utils.getElementId(checkbox.getId());
		WebElement element = findGoodElement(id);
		return executeAction(element);
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
	
	private boolean executeAction(WebElement element) throws Exception {
		CheckboxAction action = checkbox.getAction();
		if (action instanceof Click) {
			element.click();
		} else if (action instanceof IsCheck) {
			// TODO
		} else if (action instanceof Clear) {
			element.clear();
		}
		return false;
	}
	
}
