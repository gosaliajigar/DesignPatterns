package creational.abstractfactory.design.pattern.implementations;

import creational.abstractfactory.design.pattern.interfaces.Button;

/**
 * 
 * WindowsButton extends Button for LinuxOS
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class WindowsButton implements Button {

	/* (non-Javadoc)
	 * @see creational.abstractfactory.design.pattern.interfaces.Button#paint()
	 */
	@Override
	public void paint() {
		System.out.println("I am Windows Button");
	}

}
