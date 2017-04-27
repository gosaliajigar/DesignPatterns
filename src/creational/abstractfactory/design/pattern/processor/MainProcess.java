package creational.abstractfactory.design.pattern.processor;

import java.io.FileInputStream;


import creational.abstractfactory.design.pattern.controller.Application;
import creational.abstractfactory.design.pattern.implementations.LinuxGUIFactory;
import creational.abstractfactory.design.pattern.implementations.UbuntuGUIFactory;
import creational.abstractfactory.design.pattern.implementations.WindowsGUIFactory;

/**
 * Abstract Factory Design Pattern : Creational Design Pattern<br>
 * <br>
 * 
 * Provides one level of interface higher than the factory pattern. It is used
 * to return one of several factories.<br>
 * <br>
 * 
 * MainProcess reads the file at location "C:\OSType.txt" and depending on type
 * of character in OSType.txt file it instantiates the application with
 * appropriate OSGUIFactory.<br>
 * <br>
 * Application depicts AbstractFactory design pattern, where it acts as an
 * abstract factory that can create the button and call paint method to paint
 * the button.<br>
 * <br>
 * Prerequisites : Either pass OSType thru Run Configuration in Eclipse or
 * Create a OSType.txt file under C: Drive with one of the valid OSType values
 * [0:Windows;1:Linux;2:Ubuntu].<br>
 * <br>
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcess {

	/**
	 * Main Method
	 * 
	 * @param arg
	 */
	public static void main(String[] arg) {

		char[] osType = null;

		FileInputStream fileInputStream = null;

		if (arg != null && arg.length > 0) {
			osType = Character.toChars(arg[0].charAt(0));
		} else {
			try {
				fileInputStream = new FileInputStream("C:\\OSType.txt");

				// Read the OS Type from OSType.txt file
				osType = Character.toChars(fileInputStream.read());
			} catch (Exception exception) {
				System.out.println("Throwing " + exception.getClass().getName()
						+ " while reading/opening file .... ");
				System.out.println(exception.getMessage());
			} finally {
				// Set Default of fileNotFound
				if (osType == null) {
					System.out.println("As there was an exception, setting default to Windows OS!");
					System.out.println();
					osType = new char[]{'0'};
				}
			}
		}

		if (osType != null) {
			try {
				switch (osType[0]) {
				case '0': {
					System.out.println("osType Windows in OSType.txt");
					new Application(new WindowsGUIFactory());
					break;
				}
				case '1': {
					System.out.println("osType Linux in OSType.txt");
					new Application(new LinuxGUIFactory());
					break;
				}
				case '2': {
					System.out.println("osType Ubuntu in OSType.txt");
					new Application(new UbuntuGUIFactory());
					break;
				}
				default: {
					System.out
							.println("Not a valid osType set in OSType.txt [0:Windows;1:Linux;2:Ubuntu]");
				}
				}
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception exception) {
				System.out.println("Throwing " + exception.getClass().getName()
						+ " while accessing/closing file .... ");
				System.out.println(exception.getMessage());
			}
		}
	}
}
