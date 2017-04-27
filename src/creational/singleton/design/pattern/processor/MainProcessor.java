package creational.singleton.design.pattern.processor;


import creational.singleton.design.pattern.billpugh.SingletonBillPughPattern;
import creational.singleton.design.pattern.early.SingletonEarlyPattern;
import creational.singleton.design.pattern.flag.SingletonFlagPattern;
import creational.singleton.design.pattern.lazy.SingletonLazyPattern;
import creational.singleton.design.pattern.threadsafe.SingletonThreadSafeDoubleCheckedLockingPattern;
import creational.singleton.design.pattern.threadsafe.SingletonThreadSafeMethodPattern;

/**
 * Singleton Design Pattern : Creational Design Pattern<br>
 * <br>
 * One instance of a class or one value accessible globally in an application. 
 * 
 * @author "Jigar Gosalia"
 *
 */
public class MainProcessor {

	/**
	 * @param arg
	 */
	public static void main(String[] arg) {

		SingletonFlagPattern singletonFlagPattern1 = SingletonFlagPattern
				.getInstance();

		System.out.println("SingletonFlagPattern Instance 1 : " + ((singletonFlagPattern1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonFlagPattern singletonFlagPattern2 = SingletonFlagPattern
				.getInstance();

		System.out.println("SingletonFlagPattern Instance 2 : " + ((singletonFlagPattern2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonLazyPattern singletonLazyPattern1 = SingletonLazyPattern
				.getInstance();

		System.out.println("SingletonLazyPattern Instance 1 : " + ((singletonLazyPattern1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonLazyPattern singletonLazyPattern2 = SingletonLazyPattern
				.getInstance();

		System.out.println("SingletonLazyPattern Instance 2 : " + ((singletonLazyPattern2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonEarlyPattern singletonMostCommon1 = SingletonEarlyPattern.getInstance();

		System.out.println("SingletonMostCommon  Instance 1 : " + ((singletonMostCommon1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonEarlyPattern singletonMostCommon2 = SingletonEarlyPattern.getInstance();

		System.out.println("SingletonMostCommon  Instance 2 : " + ((singletonMostCommon2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafeDoubleCheckedLockingPattern singletonThreadSafe1 = SingletonThreadSafeDoubleCheckedLockingPattern.getInstance();

		System.out.println("SingletonThreadSafe  Instance 1 : " + ((singletonThreadSafe1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafeDoubleCheckedLockingPattern singletonThreadSafe2 = SingletonThreadSafeDoubleCheckedLockingPattern.getInstance();

		System.out.println("SingletonThreadSafe  Instance 2 : " + ((singletonThreadSafe2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafeMethodPattern singletonThreadSafeCleaner1 = SingletonThreadSafeMethodPattern.getInstance();

		System.out.println("SingletonThreadSafeCleaner  Instance 1 : " + ((singletonThreadSafeCleaner1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafeMethodPattern singletonThreadSafeCleaner2 = SingletonThreadSafeMethodPattern.getInstance();

		System.out.println("SingletonThreadSafeCleaner  Instance 2 : " + ((singletonThreadSafeCleaner2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonBillPughPattern singletonBestPattern1 = SingletonBillPughPattern.getInstance();

		System.out.println("SingletonBestPattern  Instance 1 : " + ((singletonBestPattern1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonBillPughPattern singletonBestPattern2 = SingletonBillPughPattern.getInstance();

		System.out.println("SingletonBestPattern  Instance 2 : " + ((singletonBestPattern2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();
	}
}
