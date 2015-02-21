package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.mda.project.browserDSL.Buttons;
import org.xtext.mda.project.browserDSL.Condition;
import org.xtext.mda.project.browserDSL.FunctionCall;
import org.xtext.mda.project.browserDSL.GoTo;
import org.xtext.mda.project.browserDSL.If;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserDSL.Links;
import org.xtext.mda.project.browserDSL.Pictures;
import org.xtext.mda.project.browserDSL.Subroutine;
import org.xtext.mda.project.browserDSL.TextFields;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.ParameterUtils;
import org.xtext.mda.project.browserdsl.interpreteur.utils.SubroutineUtils;

public class ComputeInstruction {
	
	public boolean executeInstruction(Instruction instruction) {
		try {
			if (instruction instanceof Links) {
				return new ComputeLink((Links) instruction).executeLinkAction();
			}else if (instruction instanceof Pictures){
				return new ComputePicture((Pictures) instruction).executePictureAction();
			}else if (instruction instanceof TextFields) {
				return new ComputeTextField((TextFields) instruction).executeTextFieldAction();
			} else if (instruction instanceof Buttons) {
				return new ComputeButton((Buttons) instruction).executeButtonAction();
			} else if (instruction instanceof GoTo) {
				Thread.sleep(2000);
				BrowserDSL.getBrowser().get(((GoTo) instruction).getUrl());
				return false;
			} else if (instruction instanceof FunctionCall) {
				executeFunction((FunctionCall) instruction);
				return false;
			} else if (instruction instanceof If) {
				executeIfAction((If) instruction);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void executeIfAction(If instruction) {
		boolean retour = executeInstruction(instruction.getCondition());
		if (retour) {
			EList<Instruction> instructions = instruction.getInstructions();
			for (Instruction instruction2 : instructions) {
				executeInstruction(instruction2);
			}
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
