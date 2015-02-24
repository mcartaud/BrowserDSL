package org.xtext.mda.project.browserdsl.interpreteur.exceptions;

public class ElementNotFoundException extends Exception {
	
	private static final long serialVersionUID = 9125463078008946652L;

	public ElementNotFoundException() {	}
	
	public ElementNotFoundException(String message) {
        super("L'element \"" + message + "\" ne peut pas etre trouve");
    }

    public ElementNotFoundException(Throwable cause) {
        super(cause);
    }

    public ElementNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
