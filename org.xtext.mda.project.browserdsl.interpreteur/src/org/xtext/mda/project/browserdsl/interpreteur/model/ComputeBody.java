package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.xtext.mda.project.browserDSL.Body;
import org.xtext.mda.project.browserDSL.CallType;
import org.xtext.mda.project.browserDSL.Image;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.Variable;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;

public class ComputeBody {

	private WebDriver driver;
	private Body body;
	
	public ComputeBody(Body body) {
		this.driver = BrowserDSL.getBrowser();
		this.body = body;
	}
	
	public void executeMain(){
		driver.get(body.getUrl().getUrl().toString());

		EList<Instruction> instructions = body.getInstructions();

		for (Instruction instruction : instructions) {
			executeInstruction(instruction);
		}
	}
	
	private void executeInstruction(Instruction instruction) {
		try {
			if (instruction instanceof Link) {
				executeLinkAction(instruction);
			}else if (instruction instanceof Image){
				executeImageAction(instruction);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void executeLinkAction(Instruction instruction) throws Exception{
		String id = getElementId(((Link) instruction).getId());
		WebElement link = driver
				.findElement(ByLinkText.linkText(id));
		link.click();
	}
	
	private void executeImageAction(Instruction instruction) throws Exception{
		String id = getElementId(((Image) instruction).getId());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for (WebElement image : images) {
			if(image.getAttribute("src").toLowerCase().contains(id.toLowerCase())){
				image.click();
				return;
			}
		}
		//TODO image non trouvée
		throw new Exception();
	}

	private String getElementId(CallType callType) throws Exception {
		if (callType instanceof StringValue) {
			return ((StringValue) callType).getValue();
		} else if (callType instanceof Variable) {
			// TODO récupérer la valeur d'une variable et renvoyer une exception si c'est pas du bon type
		} else {
			// TODO throw exception car pas le bon type
			throw new Exception();
		}
		return "";
	}
	
}
