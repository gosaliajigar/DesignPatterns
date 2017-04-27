package structural.facade.design.pattern.facade;

import structural.facade.design.pattern.complexparts.*;

/**
 * Facade Layer
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Computer {

	/**
	 * 
	 */
	private CPU cpu = new CPU();

	/**
	 * 
	 */
	private Memory memory = new Memory();

	/**
	 * 
	 */
	private HDD hdd = new HDD();

	/**
	 * Simple Facade Method/Interface for users to start Computer
	 */
	public void start() {
		cpu.boot();
		cpu.jump();
		cpu.execute();
		memory.loadMemory();
		hdd.loadData();
	}
}
