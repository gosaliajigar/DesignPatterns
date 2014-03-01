package com.abstractfactory.design.implementations;

import com.abstractfactory.design.interfaces.Button;
import com.abstractfactory.design.interfaces.GUIFactory;

/**
 * UbuntuGUIFactory Implementation of GUIFactory
 * 
 * @author "Jigar Gosalia"
 *
 */
public class UbuntuGUIFactory implements GUIFactory {

	/* (non-Javadoc)
	 * @see com.abstractfactory.design.interfaces.GUIFactory#createButton()
	 */
	@Override
	public Button createButton() {
		return new UbuntuButton();
	}
}
