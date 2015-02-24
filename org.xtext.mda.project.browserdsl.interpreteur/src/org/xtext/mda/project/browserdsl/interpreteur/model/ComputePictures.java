package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserDSL.PictureAction;
import org.xtext.mda.project.browserDSL.Pictures;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.exceptions.ElementNotFoundException;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputePictures {

	private Pictures pictures;

	public ComputePictures(Pictures instruction) {
		this.pictures = instruction;
	}

	public void executePicturesAction() throws Exception {
		List<WebElement> elements = findElements();
		executeAction(elements);
	}

	public boolean executePicturesBooleanAction() throws Exception {
		List<WebElement> elements = findElements();
		return executeBooleanAction(elements);
	}

	private List<WebElement> findElements() throws Exception {
		List<WebElement> elements;
		String id = Utils.getElementId(pictures.getId());
		if (id != null) {
			elements = findSpecificElements(id);
		} else {
			elements = findAllElements();
		}

		if (elements.size() != 0 || pictures.getAction() instanceof Exist) {
			return elements;
		} else {
			throw new ElementNotFoundException(id);
		}
	}

	private List<WebElement> findSpecificElements(String id) {
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

		return elements;
	}

	private List<WebElement> findAllElements() {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.cssSelector("img"));

		if (elements.size() == 0) {
			elements = BrowserDSL.getBrowser().findElements(By.cssSelector("area"));
		}

		return elements;
	}

	private void executeAction(List<WebElement> elements) {
		for (WebElement element : elements) {
			element.click();
		}
	}

	private boolean executeBooleanAction(List<WebElement> elements) {
		PictureAction action = pictures.getAction();
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
