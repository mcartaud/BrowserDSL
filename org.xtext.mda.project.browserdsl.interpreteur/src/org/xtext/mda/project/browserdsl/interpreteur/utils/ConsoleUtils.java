package org.xtext.mda.project.browserdsl.interpreteur.utils;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * Class used to print message to the user in the plugin
 * 
 */
public class ConsoleUtils {

	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	public static void writeToConsole(String msg) {
		MessageConsole myConsole = findConsole("Interpreter");
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(msg);
		out.println();

		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		try {
			IConsoleView view = (IConsoleView) page.showView(id);
			view.display(myConsole);
		} catch (PartInitException e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
	}

}
