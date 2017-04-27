package creational.singleton.design.pattern.mostcommon;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonMostCommonPattern {

	/**
	 * 
	 */
	private static SingletonMostCommonPattern instance = new SingletonMostCommonPattern();

	/**
	 * 
	 */
	private SingletonMostCommonPattern() {
		System.out.println("Instantiated SingletonMostCommon ... ");
	}

	/**
	 * @return
	 */
	public static SingletonMostCommonPattern getInstance() {
		return instance;
	}
}
