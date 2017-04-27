package creational.singleton.design.pattern.early;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonEarlyPattern {

	/**
	 * 
	 */
	private static SingletonEarlyPattern instance = new SingletonEarlyPattern();

	/**
	 * 
	 */
	private SingletonEarlyPattern() {
		System.out.println("Instantiated SingletonEarlyPattern ... ");
	}

	/**
	 * @return
	 */
	public static SingletonEarlyPattern getInstance() {
		return instance;
	}
}
