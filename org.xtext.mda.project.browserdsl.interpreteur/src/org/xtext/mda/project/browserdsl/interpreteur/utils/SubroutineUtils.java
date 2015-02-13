package org.xtext.mda.project.browserdsl.interpreteur.utils;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserDSL.Subroutine;

public class SubroutineUtils {

	private static SubroutineUtils utils = null;
	private HashMap<String, Subroutine> subroutines;
	
	private SubroutineUtils(Program program) {
		computeSubroutines(program.getSub());
	}
	
	private void computeSubroutines(EList<Subroutine> list) {
		for (Subroutine subroutine : list) {
			subroutines.put(subroutine.getHead().getName().getName(), subroutine);
		}
		
	}

	public static SubroutineUtils getSubroutineList() {
		return utils;
	}
	
	public static SubroutineUtils getSubroutineList(Program program) {
		if (utils == null) {
			utils = new SubroutineUtils(program);
		}
		return utils;
	}
	
	public HashMap<String, Subroutine> getSubroutines() {
		return subroutines;
	}
	
	public Subroutine getSubroutines(String name) {
		return subroutines.get(name);
	}
	
}
