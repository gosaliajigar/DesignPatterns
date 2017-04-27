package structural.facade.design.pattern.consumer;

import structural.facade.design.pattern.facade.Computer;

/**
 * Facade Design Pattern : Structural Design Pattern<br>
 * <br>
 * Make a complex system simpler by providing a unified or general interface,
 * which is a higher layer to these subsystems.<br>
 * <br>
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
