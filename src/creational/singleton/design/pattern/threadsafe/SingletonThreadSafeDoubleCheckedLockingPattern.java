package creational.singleton.design.pattern.threadsafe;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonThreadSafeDoubleCheckedLockingPattern {

	/**
	 * 
	 */
	private static volatile SingletonThreadSafeDoubleCheckedLockingPattern instance;

	/**
	 * 
	 */
	private SingletonThreadSafeDoubleCheckedLockingPattern() {
		System.out.println("Instantiated SingletonThreadSafeDoubleCheckedLockingPattern ... ");
	}

	/**
	 * @return
	 */
	public static SingletonThreadSafeDoubleCheckedLockingPattern getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafeDoubleCheckedLockingPattern.class) {
				if (instance == null) {
					instance = new SingletonThreadSafeDoubleCheckedLockingPattern();
				} else {
					System.out.println("Returning Existing SingletonThreadSafeDoubleCheckedLockingPattern ... ");
				}
			}
		} else {
			System.out.println("Returning Existing SingletonThreadSafeDoubleCheckedLockingPattern ... ");
		}
		return instance;
	}
}
