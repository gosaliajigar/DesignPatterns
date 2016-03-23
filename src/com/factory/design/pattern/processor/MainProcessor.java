package com.factory.design.pattern.processor;

import java.util.Arrays;
import java.util.Scanner;

import com.factory.design.pattern.implementations.CSVFile;
import com.factory.design.pattern.implementations.DBFile;
import com.factory.design.pattern.implementations.XMLFile;
import com.factory.design.pattern.interfaces.Display;

/**
 * Main Processor
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Display display = null;

		String choice = "0";

		// use a command line data as a trigger
		if (args.length > 0) {
			choice = args[0];
		} else {
			// use a user input driven data as a trigger
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the type of file you are intersested : "
					+ Arrays.asList("1:CSVFile", "2:XMLFile", "3:DBFile"));
			System.out.println();
			choice = scanner.nextLine();
			scanner.close();
		}
		display = getDisplay(choice);
		// converging code follows
		display.load("");
		display.formatConsistency();
	}

	/**
	 * @param choice
	 * @return
	 */
	private static Display getDisplay(String choice) {
		Display display = null;
		switch(choice) {
		case "1":
			display = new CSVFile();
			break;
		case "2":
			display = new XMLFile();
			break;
		case "3":
			display = new DBFile();
			break;
		default :
			System.out.println("Invalid fileType (valid : 1-3)");
			System.exit(1);			
		}
		return display;
	}
}
