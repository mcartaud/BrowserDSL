package org.xtext.mda.project.browserdsl.interpreteur.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.xtext.mda.project.browserDSL.Links;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeLink {

	private Links link;
	
	public ComputeLink(Links instruction) {
		this.link = instruction;
	}
	
	public boolean executeLinkAction() throws Exception{
		String id = Utils.getElementId(link.getId());
		WebElement element = BrowserDSL.getBrowser()
				.findElement(ByLinkText.linkText(id));
		element.click();
		return false;
	}
	
}
