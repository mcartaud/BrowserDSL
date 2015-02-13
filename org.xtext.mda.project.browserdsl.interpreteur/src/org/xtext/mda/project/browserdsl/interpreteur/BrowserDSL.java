package org.xtext.mda.project.browserdsl.interpreteur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.xtext.mda.project.browserDSL.Main;
import org.xtext.mda.project.browserDSL.OpenBrowser;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserdsl.interpreteur.utils.SubroutineUtils;

public class BrowserDSL {

	private static WebDriver driver = null;
	private static OpenBrowser browser;
	
	private BrowserDSL(){ }
	
	public static void start(Program program) {
		SubroutineUtils.getSubroutineList(program);
		Main main = program.getMain();
		browser = program.getBrowser();
		getBrowser().get("http://google.fr");
		System.out.println("tototoot");
	}
	
	public static WebDriver getBrowser() {
		if (driver == null) {
			if (browser == OpenBrowser.CHROME) {
				driver = new ChromeDriver();
			} else if (browser == OpenBrowser.FIREFOX) {
				driver = new FirefoxDriver();
			} else if (browser == OpenBrowser.HTML_UNIT_DRIVER) {
				driver = new HtmlUnitDriver();
			}
		}
		return driver;
	}

	
	
}
