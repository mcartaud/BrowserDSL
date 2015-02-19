package org.xtext.mda.project.browserdsl.interpreteur;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.xtext.mda.project.browserDSL.CallType;
import org.xtext.mda.project.browserDSL.Image;
import org.xtext.mda.project.browserDSL.Instruction;
import org.xtext.mda.project.browserDSL.Link;
import org.xtext.mda.project.browserDSL.Main;
import org.xtext.mda.project.browserDSL.OpenBrowser;
import org.xtext.mda.project.browserDSL.Program;
import org.xtext.mda.project.browserDSL.StringValue;
import org.xtext.mda.project.browserDSL.Variable;
import org.xtext.mda.project.browserdsl.interpreteur.utils.SubroutineUtils;

public class BrowserDSL {

	private static Program program;
	private static WebDriver driver;

	private BrowserDSL() {
	}

	public static void start(Program pProgram) {
		program = pProgram;

		SubroutineUtils.getSubroutineList(program);

		Main main = program.getMain();

		driver = getBrowser();
		String url = program.getMain().getBody().getUrl().getUrl().toString();
		driver.get(url);

		EList<Instruction> instructions = main.getBody().getInstructions();

		for (Instruction instruction : instructions) {
			executeInstruction(instruction);
		}

	}

	public static void executeInstruction(Instruction instruction) {
		try {
			if (instruction instanceof Link) {
				executeLinkAction(instruction);
			}else if (instruction instanceof Image){
				executeImageAction(instruction);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void executeLinkAction(Instruction instruction) throws Exception{
		String id = getElementId(((Link) instruction).getId());
		WebElement link = driver
				.findElement(ByLinkText.linkText(id));
		link.click();
	}
	
	public static void executeImageAction(Instruction instruction) throws Exception{
		String id = getElementId(((Image) instruction).getId());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for (WebElement image : images) {
			if(image.getAttribute("src").toLowerCase().contains(id.toLowerCase())){
				image.click();
				return;
			}
		}
		//TODO image non trouvée
		throw new Exception();
	}

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

	public static WebDriver getBrowser() {
		WebDriver driver;
		OpenBrowser browser = program.getBrowser();
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
		return driver;
	}

}
