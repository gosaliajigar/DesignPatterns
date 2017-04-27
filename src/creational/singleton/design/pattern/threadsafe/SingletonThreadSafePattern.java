package creational.singleton.design.pattern.threadsafe;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonThreadSafePattern {

	/**
	 * 
	 */
	private static volatile SingletonThreadSafePattern instance = null;

	/**
	 * 
	 */
	private SingletonThreadSafePattern() {
		System.out.println("Instantiated SingletonThreadSafe ... ");
	}

	/**
	 * @return
	 */
	public static SingletonThreadSafePattern getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafePattern.class) {
				if (instance == null) {
					instance = new SingletonThreadSafePattern();
				} else {
					System.out.println("Returning Existing SingletonThreadSafe ... ");
				}
			}
		} else {
			System.out.println("Returning Existing SingletonThreadSafe ... ");
		}
		return instance;
	}
}
