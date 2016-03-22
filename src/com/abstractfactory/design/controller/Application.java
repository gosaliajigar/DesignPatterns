package com.abstractfactory.design.controller;

import com.abstractfactory.design.interfaces.Button;
import com.abstractfactory.design.interfaces.GUIFactory;

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
