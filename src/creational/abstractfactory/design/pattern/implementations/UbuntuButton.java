package creational.abstractfactory.design.pattern.implementations;

import creational.abstractfactory.design.pattern.interfaces.Button;

/**
 * 
 * UbuntuButton extends Button for LinuxOS
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class UbuntuButton implements Button {

	/* (non-Javadoc)
	 * @see com.abstractfactory.design.interfaces.Button#paint()
	 */
	@Override
	public void paint() {
		System.out.println("I am Ubuntu Button");
	}

}
