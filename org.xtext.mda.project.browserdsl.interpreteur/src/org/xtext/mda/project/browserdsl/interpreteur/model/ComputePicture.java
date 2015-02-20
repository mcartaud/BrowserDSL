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
		List<WebElement> elements = findGoodElements(id);
		for (WebElement element : elements) {
			element.click();
		}
	}
	
	private List<WebElement> findGoodElements(String id) throws Exception {
		
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.xpath("//img[contains(@src, \""+id+"\")]"));
		if(elements.size()==0){
			elements = BrowserDSL.getBrowser().findElements(By.xpath("//area[contains(@title, '"+id+"','i')]"));
		}
		
		if(elements.size()!=0){
			return elements;
		}else{
			//TODO exception element not found
			throw new Exception();
		}
	}
}
