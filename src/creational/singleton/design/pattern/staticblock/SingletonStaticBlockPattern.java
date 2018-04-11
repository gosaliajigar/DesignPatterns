package creational.singleton.design.pattern.staticblock;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonStaticBlockPattern {

	/**
	 * 
	 */
	private static final SingletonStaticBlockPattern instance;

	/**
	 * 
	 */
	private SingletonStaticBlockPattern() {
		System.out.println("Instantiated SingletonStaticBlockPattern ... ");
	}

	static {
		instance = new SingletonStaticBlockPattern();
	}

	/**
	 * @return
	 */
	public static SingletonStaticBlockPattern getInstance() {
		return instance;
	}
}
