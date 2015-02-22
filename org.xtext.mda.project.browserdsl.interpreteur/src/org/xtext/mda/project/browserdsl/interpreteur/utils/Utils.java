package org.xtext.mda.project.browserdsl.interpreteur.utils;

import org.xtext.mda.project.browserDSL.BooleanValue;
import org.xtext.mda.project.browserDSL.CallType;
import org.xtext.mda.project.browserDSL.Declaration;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.Variable;

public class Utils {

	public static String getElementId(CallType callType) throws Exception {
		return getStringValue(callType);
	}

	public static String getElementValue(CallType callType) throws Exception {
		return getStringValue(callType);
	}
	
	private static String getStringValue(CallType callType) throws Exception {
		if(callType==null){
			return null;
		}else if (callType instanceof StringValue) {
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
	
	public static Boolean getBooleanValue(CallType callType) throws Exception {
//		if(callType==null){
//			return null;
//		}else if (callType instanceof BooleanValue) {
			return  (((BooleanValue) callType).getValue().equals(org.xtext.mda.project.browserDSL.Boolean.TRUE))? true : false ;
//		} 
//		else if (callType instanceof Variable) {
//			String varName = ((Variable) callType).getVarID().getName();
//			String variableName = ParameterUtils.getVariable(varName);
//			if (variableName != null) {
//				return variableName;
//			}
//			Declaration variable = VariableUtils.getVariable(varName);
//			if (variable.getValue() instanceof StringValue) {
//				Declaration declaration = (Declaration) variable;
//				return ((StringValue) declaration.getValue()).getValue();
//			} else {
//				// TODO throw exception car pas le bon type
//				throw new Exception();
//			}
//		} else {
//			// TODO throw exception car pas le bon type
//			throw new Exception();
//		}
	}
	
}
