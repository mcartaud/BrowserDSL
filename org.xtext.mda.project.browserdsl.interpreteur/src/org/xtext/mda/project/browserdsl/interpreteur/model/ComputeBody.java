package org.xtext.mda.project.browserdsl.interpreteur.model;

import org.eclipse.emf.common.util.EList;
import org.openqa.selenium.WebDriver;
import org.xtext.mda.project.browserDSL.Body;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;

public class ComputeBody {

	private WebDriver driver;
	private Body body;
	
	public ComputeBody(Body body) {
		this.driver = BrowserDSL.getBrowser();
		this.body = body;
	}
	
	public void executeMain(){
		driver.get(body.getUrl().getUrl());

		EList<Instruction> instructions = body.getInstructions();

		for (Instruction instruction : instructions) {
			new ComputeInstruction().executeInstruction(instruction);
		}
	}
}
