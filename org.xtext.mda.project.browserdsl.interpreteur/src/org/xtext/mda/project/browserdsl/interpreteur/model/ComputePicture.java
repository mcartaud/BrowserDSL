package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.Click;
import org.xtext.mda.project.browserDSL.PictureAction;
import org.xtext.mda.project.browserDSL.Pictures;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputePicture {

	private Pictures pictures;

	public ComputePicture(Pictures instruction) {
		this.pictures = instruction;
	}

	public void executePictureAction() throws Exception {
		String id = Utils.getElementId(pictures.getId());
		List<WebElement> elements = findGoodElements(id);
		executeAction(elements);
	}

	private List<WebElement> findGoodElements(String id) throws Exception {

		List<WebElement> elements = new ArrayList<WebElement>();
		List<WebElement> elementsFound = BrowserDSL.getBrowser().findElements(By.cssSelector("img"));
		for (WebElement element : elementsFound) {
			if (element.getAttribute("src").toLowerCase().trim().contains(id.toLowerCase())) {
				elements.add(element);
			}
		}

		if (elements.size() == 0) {
			elementsFound = BrowserDSL.getBrowser().findElements(By.cssSelector("area"));
			for (WebElement element : elementsFound) {
				if (element.getAttribute("title").toLowerCase().trim().contains(id.toLowerCase())) {
					elements.add(element);
				}
			}
		}

		if (elements.size() != 0) {
			return elements;
		} else {
			// TODO exception element not found
			throw new Exception();
		}
	}

	private void executeAction(List<WebElement> elements) throws Exception {
		PictureAction action = pictures.getAction();
		if (action instanceof Click) {
			for (WebElement element : elements) {
				element.click();
			}
		}
	}
}
