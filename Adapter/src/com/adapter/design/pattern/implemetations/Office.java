package com.adapter.design.pattern.implemetations;

import com.adapter.design.pattern.interfaces.Clean;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Office implements Clean {

	/* (non-Javadoc)
	 * @see com.adapter.design.pattern.interfaces.Clean#makeClean()
	 */
	public void makeClean() {
		System.out.println("Clean Office");
	}
}