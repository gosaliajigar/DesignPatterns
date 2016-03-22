package com.abstractfactory.design.implementations;

import com.abstractfactory.design.interfaces.Button;
import com.abstractfactory.design.interfaces.GUIFactory;

/**
 * WindowsGUIFactory Implementation of GUIFactory
 * 
 * @author "Jigar Gosalia"
 *
 */
public class WindowsGUIFactory implements GUIFactory {

	/* (non-Javadoc)
	 * @see com.abstractfactory.design.interfaces.GUIFactory#createButton()
	 */
	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
