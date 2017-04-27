package creational.abstractfactory.design.pattern.implementations;

import creational.abstractfactory.design.pattern.interfaces.Button;
import creational.abstractfactory.design.pattern.interfaces.GUIFactory;

/**
 * LinuxGUIFactory Implementation of GUIFactory
 * 
 * @author "Jigar Gosalia"
 *
 */
public class LinuxGUIFactory implements GUIFactory {

	/* (non-Javadoc)
	 * @see creational.abstractfactory.design.pattern.interfaces.GUIFactory#createButton()
	 */
	@Override
	public Button createButton() {
		return new LinuxButton();
	}
}
