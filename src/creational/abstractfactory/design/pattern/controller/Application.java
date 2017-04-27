package creational.abstractfactory.design.pattern.controller;

import creational.abstractfactory.design.pattern.interfaces.Button;
import creational.abstractfactory.design.pattern.interfaces.GUIFactory;

/**
 * Application depicts AbstractFactory design pattern, where it acts as an
 * abstract factory that can create the button and call paint method to paint
 * the button.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Application {

	/**
	 * Application Constructor
	 * 
	 * @param guiFactory
	 */
	public Application(GUIFactory guiFactory) {

		// As we have OS specific GUIFactory implementation and each of the
		// GUIFactory implementation has its own implementation for
		// createButton, it creates OS specific Button instance.
		Button button = guiFactory.createButton();
		// OS specific Button has its own implementation for paint method
		button.paint();
	}
}
