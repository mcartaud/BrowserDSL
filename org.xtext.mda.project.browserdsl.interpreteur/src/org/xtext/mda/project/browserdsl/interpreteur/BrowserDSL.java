package org.xtext.mda.project.browserdsl.interpreteur;

import org.eclipse.emf.ecore.EObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDSL {

	public static void start(EObject eobject) {
	
		System.out.println("ppppppppppp");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
		
		driver.quit();
	}

	
	
}
