package org.xtext.mda.project.browserdsl.interpreteur.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeLink {

	private Link link;
	
	public ComputeLink(Link instruction) {
		this.link = instruction;
	}
	
	public void executeLinkAction() throws Exception{
		String id = Utils.getElementId(link.getId());
		WebElement element = BrowserDSL.getBrowser()
				.findElement(ByLinkText.linkText(id));
		element.click();
	}
	
}
