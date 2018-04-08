package structural.facade.design.pattern.complexparts;

/**
 * Complex Parts
 * 
 * @author "Jigar Gosalia"
 *
 */
public class CPU {

	public void execute() {
		System.out.println("CPU : Execute Assembly commands ...");
	}

	public void jump() {
		System.out.println("CPU : Jump to Start Memory ...");
	}

	public void boot() {
		System.out.println("CPU : Booting ...");
	}
}
