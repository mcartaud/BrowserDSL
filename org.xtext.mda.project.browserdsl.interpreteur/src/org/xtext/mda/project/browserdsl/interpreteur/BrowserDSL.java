package org.xtext.mda.project.browserdsl.interpreteur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.xtext.mda.project.browserDSL.OpenBrowser;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserdsl.interpreteur.model.ComputeBody;
import org.xtext.mda.project.browserdsl.interpreteur.utils.SubroutineUtils;
import org.xtext.mda.project.browserdsl.interpreteur.utils.VariableUtils;

public class BrowserDSL {

	private static Program program;
	private static WebDriver driver;

	private BrowserDSL() {
	}

	public static void start(Program pProgram) {
		program = pProgram;
		SubroutineUtils.setSubroutineList(program.getSubroutines());
		System.out.println(System.getenv("xsl:version"));
		VariableUtils.setVariableList(program.getVariables());
		
		ComputeBody body = new ComputeBody(program.getMain().getBody());
		
		body.executeMain();
		
		driver.close();
		driver=null;

	}

	public static WebDriver getBrowser() {
		OpenBrowser browser = program.getBrowser();
		if (driver == null) {
			switch (browser) {
			case CHROME:
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			default:
				driver = new HtmlUnitDriver();
				break;
			}
		}
		return driver;
	}

}
