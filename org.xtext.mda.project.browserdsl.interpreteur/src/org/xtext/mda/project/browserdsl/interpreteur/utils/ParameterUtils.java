package org.xtext.mda.project.browserdsl.interpreteur.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.mda.project.browserDSL.CallType;
import org.xtext.mda.project.browserDSL.VariableName;

public class ParameterUtils {

	public static Map<String, String> variables = new HashMap<String, String>();
	
	public static void removeParameters(EList<VariableName> nameParameters) {
		for (int i = 0; i < nameParameters.size(); i++) {
			variables.remove(nameParameters.get(i).getName());
		}
	}

	public static void setParameters(EList<VariableName> nameParameters,
			EList<CallType> parameters) throws Exception {
		if (nameParameters.size() != parameters.size()) {
			throw new Exception();
		}
		
		for (int i = 0; i < nameParameters.size(); i++) {
			variables.put(nameParameters.get(i).getName(), Utils.getElementId(parameters.get(i)));
		}
	}
	
	public static Map<String, String> getVariables() {
		return variables;
	}
	
	public static String getVariable(String name) {
		return variables.get(name);
	}
	
}
