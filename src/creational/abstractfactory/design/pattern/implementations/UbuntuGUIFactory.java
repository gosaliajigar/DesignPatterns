package creational.abstractfactory.design.pattern.implementations;

import creational.abstractfactory.design.pattern.interfaces.Button;
import creational.abstractfactory.design.pattern.interfaces.GUIFactory;

/**
 * UbuntuGUIFactory Implementation of GUIFactory
 * 
 * @author "Jigar Gosalia"
 *
 */
public class UbuntuGUIFactory implements GUIFactory {

	/* (non-Javadoc)
	 * @see creational.abstractfactory.design.pattern.interfaces.GUIFactory#createButton()
	 */
	@Override
	public Button createButton() {
		return new UbuntuButton();
	}
}
