package creational.singleton.design.pattern.threadsafe;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonThreadSafeMethodPattern {

	private static volatile SingletonThreadSafeMethodPattern instance;

	private SingletonThreadSafeMethodPattern() {
		System.out.println("Instantiated SingletonThreadSafeMethodPattern ... ");
	}

	/**
	 * @return
	 */
	public static synchronized SingletonThreadSafeMethodPattern getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafeMethodPattern();
		} else {
			System.out
					.println("Returning Existing SingletonThreadSafeMethodPattern ... ");
		}
		return instance;
	}
}
