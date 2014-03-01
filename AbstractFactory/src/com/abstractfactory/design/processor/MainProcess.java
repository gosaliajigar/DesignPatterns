package com.abstractfactory.design.processor;

import java.io.FileInputStream;

import com.abstractfactory.design.controller.Application;
import com.abstractfactory.design.implementations.LinuxGUIFactory;
import com.abstractfactory.design.implementations.UbuntuGUIFactory;
import com.abstractfactory.design.implementations.WindowsGUIFactory;

/**
 * MainProcess reads the file at location "C:\OSType.txt" and depending on type
 * of character in OSType.txt file it instantiates the application with
 * appropriate OSGUIFactory.
 * 
 * Application depicts AbstractFactory design pattern, where it acts as an
 * abstract factory that can create the button and call paint method to paint
 * the button.
 * 
 * Prerequisites : Either pass OSType thru Run Configuration in Eclipse or
 * Create a OSType.txt file under C: Drive with one of the valid OSType values
 * [0:Windows;1:Linux;2:Ubuntu].
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
