package com.abstractfactory.design.implementations;

import com.abstractfactory.design.interfaces.Button;
import com.abstractfactory.design.interfaces.GUIFactory;

/**
 * LinuxGUIFactory Implementation of GUIFactory
 * 
 * @author "Jigar Gosalia"
 *
 */
public class LinuxGUIFactory implements GUIFactory {

	/* (non-Javadoc)
	 * @see com.abstractfactory.design.interfaces.GUIFactory#createButton()
	 */
	@Override
	public Button createButton() {
		return new LinuxButton();
	}
}
