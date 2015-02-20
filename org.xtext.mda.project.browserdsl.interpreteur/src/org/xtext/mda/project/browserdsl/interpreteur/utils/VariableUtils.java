package org.xtext.mda.project.browserdsl.interpreteur.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.mda.project.browserDSL.Declaration;

public class VariableUtils {

	private static Map<String, Declaration> variables;
	
	private VariableUtils() { }
	
	public static void setVariableList(EList<Declaration> list) {
		variables = new HashMap<String, Declaration>();
		for (Declaration declaration : list) {
			variables.put(declaration.getVariable().getName(), declaration);
		}
	}
	
	public static Map<String, Declaration> getVariables() {
		return variables;
	}
	
	public static Declaration getVariable(String name) {
		return variables.get(name);
	}

}
