package creational.singleton.design.pattern.lazy;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonLazyPattern {

	/**
	 * 
	 */
	private static SingletonLazyPattern instance;

	/**
	 * 
	 */
	private SingletonLazyPattern() {
		System.out.println("Instantiated SingletonLazyPattern ... ");
	}

	/**
	 * @return
	 */
	public static SingletonLazyPattern getInstance() {
		if (instance == null) {
			instance = new SingletonLazyPattern();
		} else {
			System.out.println("Returning Existing SingletonLazyPattern ... ");
		}
		return instance;
	}
}
