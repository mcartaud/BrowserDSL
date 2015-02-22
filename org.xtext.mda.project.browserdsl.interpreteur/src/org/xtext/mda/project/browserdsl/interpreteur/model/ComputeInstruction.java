package org.xtext.mda.project.browserdsl.interpreteur.model;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.xtext.mda.project.browserDSL.BooleanAction;
import org.xtext.mda.project.browserDSL.Buttons;
import org.xtext.mda.project.browserDSL.Checkboxs;
import org.xtext.mda.project.browserDSL.Condition;
import org.xtext.mda.project.browserDSL.FunctionCall;
import org.xtext.mda.project.browserDSL.GoTo;
import org.xtext.mda.project.browserDSL.If;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserDSL.Links;
import org.xtext.mda.project.browserDSL.Pictures;
import org.xtext.mda.project.browserDSL.Subroutine;
import org.xtext.mda.project.browserDSL.TextFields;
import org.xtext.mda.project.browserDSL.While;
import org.xtext.mda.project.browserdsl.interpreteur.BrowserDSL;
import org.xtext.mda.project.browserdsl.interpreteur.utils.ParameterUtils;
import org.xtext.mda.project.browserdsl.interpreteur.utils.SubroutineUtils;

public class ComputeInstruction {

	public void executeInstruction(Instruction instruction) {
		try {
			if (instruction instanceof Links) {
				new ComputeLinks((Links) instruction).executeLinksAction();
			} else if (instruction instanceof Pictures) {
				new ComputePictures((Pictures) instruction).executePicturesAction();
			} else if (instruction instanceof TextFields) {
				new ComputeTextFields((TextFields) instruction).executeTextFieldsAction();
			} else if (instruction instanceof Buttons) {
				new ComputeButtons((Buttons) instruction).executeButtonsAction();
			} else if (instruction instanceof Checkboxs) {
				new ComputeCheckboxs((Checkboxs) instruction).executeCheckboxsAction();
			} else if (instruction instanceof GoTo) {
				BrowserDSL.getBrowser().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				BrowserDSL.getBrowser().get(((GoTo) instruction).getUrl());
				BrowserDSL.getBrowser().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			} else if (instruction instanceof FunctionCall) {
				executeFunction((FunctionCall) instruction);
			} else if (instruction instanceof If) {
				executeIfAction((If) instruction);
			} else if (instruction instanceof While) {
				executeWhileAction((While) instruction);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean executeCondition(Condition condition) {
		try {
			if (condition instanceof Links && ((Links) condition).getAction() instanceof BooleanAction) {
				return new ComputeLinks((Links) condition).executeLinksBooleanAction();
			} else if (condition instanceof Pictures && ((Pictures) condition).getAction() instanceof BooleanAction) {
				return new ComputePictures((Pictures) condition).executePicturesBooleanAction();
			} else if (condition instanceof TextFields && ((TextFields) condition).getAction() instanceof BooleanAction) {
				return new ComputeTextFields((TextFields) condition).executeTextFieldsBooleanAction();
			} else if (condition instanceof Buttons && ((Buttons) condition).getAction() instanceof BooleanAction) {
				return new ComputeButtons((Buttons) condition).executeButtonsBooleanAction();
			} else if (condition instanceof Checkboxs && ((Checkboxs) condition).getAction() instanceof BooleanAction) {
				return new ComputeCheckboxs((Checkboxs) condition).executeCheckboxsBooleanAction();
			} else {
				// TODO non boolean expression
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void executeIfAction(If ifInstruction) {
		boolean retour = executeCondition(ifInstruction.getCondition());
		if (retour) {
			EList<Instruction> instructions = ifInstruction.getInstructions();
			for (Instruction instruction : instructions) {
				executeInstruction(instruction);
			}
		}
	}

	public void executeWhileAction(While whileInstruction) {
		boolean retour = executeCondition(whileInstruction.getCondition());
		EList<Instruction> instructions = whileInstruction.getInstructions();
		while (retour) {
			for (Instruction instruction : instructions) {
				executeInstruction(instruction);
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
