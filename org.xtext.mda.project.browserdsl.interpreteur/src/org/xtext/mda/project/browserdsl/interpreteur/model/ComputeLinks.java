package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xtext.mda.project.browserDSL.Exist;
import org.xtext.mda.project.browserDSL.LinkAction;
import org.xtext.mda.project.browserDSL.Links;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.exceptions.ElementNotFoundException;
import org.xtext.mda.project.browserdsl.interpreteur.utils.Utils;

public class ComputeLinks {

	private Links links;

	public ComputeLinks(Links instruction) {
		this.links = instruction;
	}

	public void executeLinksAction() throws Exception {
		List<WebElement> elements = findElements();
		executeAction(elements);
	}

	public boolean executeLinksBooleanAction() throws Exception {
		List<WebElement> elements = findElements();
		return executeBooleanAction(elements);
	}

	private List<WebElement> findElements() throws Exception {
		List<WebElement> elements;
		String id = Utils.getElementId(links.getId());
		if (id != null) {
			elements = findSpecificElements(id);
		} else {
			elements = findAllElements();
		}

		if (elements.size() != 0 || links.getAction() instanceof Exist) {
			return elements;
		} else {
			throw new ElementNotFoundException(id);
		}
	}

	private List<WebElement> findSpecificElements(String id) {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.linkText(id));
		if (elements.size() == 0) {
			elements = BrowserDSL.getBrowser().findElements(By.partialLinkText(id));
		}
		return elements;
	}

	private List<WebElement> findAllElements() {
		List<WebElement> elements = BrowserDSL.getBrowser().findElements(By.cssSelector("a"));
		return elements;
	}

	private void executeAction(List<WebElement> elements) {
		// for (WebElement element : elements) {
		elements.get(0).click();
		// }
	}

	private boolean executeBooleanAction(List<WebElement> elements) {
		LinkAction action = links.getAction();
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
