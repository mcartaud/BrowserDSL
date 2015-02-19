package org.xtext.mda.project.browserdsl.interpreteur.utils;

import org.xtext.mda.project.browserDSL.CallType;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.Variable;

public class Utils {

	public static String getElementId(CallType callType) throws Exception {
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
