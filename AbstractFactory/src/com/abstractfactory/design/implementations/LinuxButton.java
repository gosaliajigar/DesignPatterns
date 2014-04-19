package com.abstractfactory.design.implementations;

import com.abstractfactory.design.interfaces.Button;

/**
 * 
 * LinuxButton extends Button for LinuxOS
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class LinuxButton implements Button {

	/* (non-Javadoc)
	 * @see com.abstractfactory.design.interfaces.Button#paint()
	 */
	@Override
	public void paint() {
		System.out.println("I am Linux Button");
	}

}
