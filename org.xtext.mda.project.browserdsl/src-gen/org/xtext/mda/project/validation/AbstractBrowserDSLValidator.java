/*
 * generated by Xtext
 */
package org.xtext.mda.project.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractBrowserDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.mda.project.browserDSL.BrowserDSLPackage.eINSTANCE);
		return result;
	}
}
