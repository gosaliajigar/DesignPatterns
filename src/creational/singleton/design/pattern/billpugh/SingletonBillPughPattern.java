package creational.singleton.design.pattern.billpugh;

/**
 * Initialization-On-Demand Holder idiom
 * 
 * The initialization of the SingletonHolder class results in static variable
 * INSTANCE being initialized by executing the (private) constructor for the
 * outer class SingletonBillPughPattern. Since the class initialization phase is
 * guaranteed by the Java Language Specification to be serial, i.e.,
 * non-concurrent, no further synchronization is required in the static
 * getInstance method during loading and initialization. And since the
 * initialization phase writes the static variable INSTANCE in a serial
 * operation, all subsequent concurrent invocations of the getInstance will
 * return the same correctly initialized INSTANCE without incurring any
 * additional synchronization overhead.<br>
 * <br>
 * Bill Pugh Singleton is the best approach so far, but it can be easily destroyed 
 * with the use of Java reflection.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class SingletonBillPughPattern {

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
