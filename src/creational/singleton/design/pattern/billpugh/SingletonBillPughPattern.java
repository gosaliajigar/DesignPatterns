package creational.singleton.design.pattern.billpugh;

/**
 * @author "Jigar Gosalia"
 *
 */
public class SingletonBillPughPattern {

	/**
	 * 
	 */
	private SingletonBillPughPattern() {
		System.out.println("Instantiated SingletonBillPughPattern ... ");
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * SingletonBillPughPattern.getInstance() or the first access
	 * to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		private static final SingletonBillPughPattern INSTANCE = new SingletonBillPughPattern();
	}

	/**
	 * @return
	 */
	public static SingletonBillPughPattern getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
