package creational.singleton.design.pattern.threadsafe;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonThreadSafeCleanerPattern {

	/**
	 * 
	 */
	private static volatile SingletonThreadSafeCleanerPattern instance = null;

	/**
	 * 
	 */
	private SingletonThreadSafeCleanerPattern() {
		System.out.println("Instantiated SingletonThreadSafeCleaner ... ");
	}

	/**
	 * @return
	 */
	public static synchronized SingletonThreadSafeCleanerPattern getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafeCleanerPattern();
		} else {
			System.out
					.println("Returning Existing SingletonThreadSafeCleaner ... ");
		}
		return instance;
	}
}
