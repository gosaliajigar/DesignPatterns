package creational.singleton.design.pattern.threadsafe;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonThreadSafe {

	/**
	 * 
	 */
	private static volatile SingletonThreadSafe instance = null;

	/**
	 * 
	 */
	private SingletonThreadSafe() {
		System.out.println("Instantiated SingletonThreadSafe ... ");
	}

	/**
	 * @return
	 */
	public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafe.class) {
				if (instance == null) {
					instance = new SingletonThreadSafe();
				}
			}
		} else {
			System.out.println("Returning Existing SingletonThreadSafe ... ");
		}
		return instance;
	}
}
