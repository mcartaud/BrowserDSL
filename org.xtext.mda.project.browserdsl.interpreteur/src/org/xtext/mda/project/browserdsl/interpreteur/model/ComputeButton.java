package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.Button;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeButton {

	private Button button;
	
	public ComputeButton(Button instruction) {
		this.button = instruction;
	}
	
	public void executeButtonAction() throws Exception {
		String id = Utils.getElementId(button.getId());
		WebElement element = findGoodElement(id);
		element.click();
	}
	
	private WebElement findGoodElement(String id) {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.xpath("//*[@type='submit']"));
		for (WebElement element : elements) {
			if (element.getAttribute("value").toLowerCase().trim().contains(id.toLowerCase())) {
				return element;
			}
		}	
		return null;
	}
	
}
