package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.Picture;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputePicture {
	
	private Picture picture;
	
	public ComputePicture(Picture instruction) {
		this.picture = instruction;
	}
	
	public void executePictureAction() throws Exception{
		String id = Utils.getElementId(picture.getId());
		findGoodElement(id).click();
	}
	
	private WebElement findGoodElement(String id) throws Exception {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.tagName("img"));
		for (WebElement element : elements) {
			if(element.getAttribute("src").toLowerCase().trim().contains(id.toLowerCase())){
				return element;
			}
		}
		
		elements = BrowserDSL.getBrowser().findElements(By.xpath("//*[@shape='poly']"));
		for (WebElement element : elements) {
			if(element.getAttribute("title").toLowerCase().trim().contains(id.toLowerCase())){
				return element;
			}
		}
		
		//TODO image non trouvée
		throw new Exception();
	}
}
