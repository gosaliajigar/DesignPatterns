package structural.adapter.design.pattern.implemetations;

import structural.adapter.design.pattern.interfaces.Clean;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Workshop implements Clean {

	/* (non-Javadoc)
	 * @see com.adapter.design.pattern.interfaces.Clean#makeClean()
	 */
	public void makeClean() {
		System.out.println("Clean Workshop");
	}
}