package com.adapter.design.pattern.processor;

import com.adapter.design.pattern.implemetations.Facility;
import com.adapter.design.pattern.implemetations.Office;
import com.adapter.design.pattern.implemetations.Workshop;
import com.adapter.design.pattern.interfaces.Clean;
import com.adapter.design.pattern.interfaces.Extra;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Extra extra = new Facility();
		MainProcessor.doTasks(extra);
		Clean c1 = new Office();
		Clean c2 = new Workshop();
		MainProcessor.doTasks(c1);
		MainProcessor.doTasks(c2);
	}

	// In order to reuse Workshop and Office classes,
	// we create an adapter interface Extra and
	// add new job takeCare in the system.
	public static void doTasks(Clean job) {
		if (job instanceof Extra) {
			((Extra) job).takeCare();
			((Extra) job).makeClean();
		} else if (job instanceof Clean) {
			((Clean) job).makeClean();
		}
	}
}
