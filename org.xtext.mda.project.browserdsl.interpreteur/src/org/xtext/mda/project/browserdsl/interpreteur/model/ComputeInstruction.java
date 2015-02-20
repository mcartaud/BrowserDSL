package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.xtext.mda.project.browserDSL.Buttons;
import org.xtext.mda.project.browserDSL.FunctionCall;
import org.xtext.mda.project.browserDSL.GoTo;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserDSL.Links;
import org.xtext.mda.project.browserDSL.Pictures;
import org.xtext.mda.project.browserDSL.Subroutine;
import org.xtext.mda.project.browserDSL.TextFields;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.ParameterUtils;
import org.xtext.mda.project.browserdsl.interpreteur.utils.SubroutineUtils;

public class ComputeInstruction {
	
	public void executeInstruction(Instruction instruction) {
		try {
			if (instruction instanceof Links) {
				new ComputeLink((Links) instruction).executeLinkAction();
			}else if (instruction instanceof Pictures){
				new ComputePicture((Pictures) instruction).executePictureAction();
			}else if (instruction instanceof TextFields) {
				new ComputeTextField((TextFields) instruction).executeTextFieldAction();
			} else if (instruction instanceof Buttons) {
				new ComputeButton((Buttons) instruction).executeButtonAction();
			} else if (instruction instanceof GoTo) {
				Thread.sleep(2000);
				BrowserDSL.getBrowser().get(((GoTo) instruction).getUrl());
			} else if (instruction instanceof FunctionCall) {
				executeFunction((FunctionCall) instruction);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void executeFunction(FunctionCall instruction) throws Exception {
		FunctionCall call = (FunctionCall) instruction;
		
		String functionName = call.getFunction().getFunctionName().getName();
		Subroutine subroutine = SubroutineUtils.getSubroutine(functionName);
		
		ParameterUtils.setParameters(subroutine.getHead().getNameParameters(), call.getParameters());
		
		List<Instruction> instructions = subroutine.getBody().getInstructions();
		for (Instruction instruction2 : instructions) {
			executeInstruction(instruction2);
		}
		
		ParameterUtils.removeParameters(subroutine.getHead().getNameParameters());
	}
	
}
