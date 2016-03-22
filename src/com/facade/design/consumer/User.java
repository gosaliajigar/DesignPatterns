package com.facade.design.consumer;

import com.facade.design.facade.Computer;

/**
 * User (End Client)
 * 
 * @author "Jigar Gosalia"
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
	}
}
