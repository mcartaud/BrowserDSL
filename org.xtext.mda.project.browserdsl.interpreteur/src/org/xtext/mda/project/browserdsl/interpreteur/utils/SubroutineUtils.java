package org.xtext.mda.project.browserdsl.interpreteur.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.mda.project.browserDSL.Subroutine;

public class SubroutineUtils {

	private static Map<String, Subroutine> subroutines;
	
	private SubroutineUtils() { }
	
	public static void setSubroutineList(EList<Subroutine> list) {
		subroutines = new HashMap<String, Subroutine>();
		for (Subroutine subroutine : list) {
			subroutines.put(subroutine.getHead().getName().getName(), subroutine);
		}
	}
	
	public static Map<String, Subroutine> getSubroutines() {
		return subroutines;
	}
	
	public static Subroutine getSubroutines(String name) {
		return subroutines.get(name);
	}
	
}
