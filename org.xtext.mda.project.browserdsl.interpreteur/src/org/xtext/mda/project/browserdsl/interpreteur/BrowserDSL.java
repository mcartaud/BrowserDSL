package org.xtext.mda.project.browserdsl.interpreteur;

import org.eclipse.emf.common.util.EList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xtext.mda.project.browserDSL.Main;
import org.xtext.mda.project.browserDSL.OpenBrowser;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserDSL.Subroutine;

public class BrowserDSL {

	private static WebDriver driver = null;
	private static OpenBrowser browser;
	
	private BrowserDSL(){ }
	
	public static void start(Program program) {
		EList<Subroutine> subs = program.getSubroutines();
		Main main = program.getMain();
		browser = program.getBrowser();
		getBrowser().get("http://google.fr");
	}
	
	public static WebDriver getBrowser() {
		if (driver == null) {
			if (browser == OpenBrowser.CHROME) {
				driver = new ChromeDriver();
			} else if (browser == OpenBrowser.FIREFOX) {
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

	
	
}
