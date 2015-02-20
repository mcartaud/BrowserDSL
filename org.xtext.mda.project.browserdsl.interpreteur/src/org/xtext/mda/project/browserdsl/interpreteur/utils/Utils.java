package org.xtext.mda.project.browserdsl.interpreteur.utils;

import org.xtext.mda.project.browserDSL.CallType;
import org.xtext.mda.project.browserDSL.Declaration;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.Variable;

public class Utils {

	public static String getElementId(CallType callType) throws Exception {
		if (callType instanceof StringValue) {
			return ((StringValue) callType).getValue();
		} else if (callType instanceof Variable) {
			String varName = ((Variable) callType).getVarID().getName();
			String variableName = ParameterUtils.getVariable(varName);
			if (variableName != null) {
				return variableName;
			}
			Declaration variable = VariableUtils.getVariable(varName);
			if (variable.getValue() instanceof StringValue) {
				Declaration declaration = (Declaration) variable;
				return ((StringValue) declaration.getValue()).getValue();
			} else {
				// TODO throw exception car pas le bon type
				throw new Exception();
			}
		} else {
			// TODO throw exception car pas le bon type
			throw new Exception();
		}
	}
	
}
