package creational.singleton.design.pattern.processor;


import creational.singleton.design.pattern.best.SingletonBestPattern;
import creational.singleton.design.pattern.flag.SingletonFlagPattern;
import creational.singleton.design.pattern.lazy.SingletonLazyPattern;
import creational.singleton.design.pattern.mostcommon.SingletonMostCommon;
import creational.singleton.design.pattern.threadsafe.SingletonThreadSafe;
import creational.singleton.design.pattern.threadsafe.SingletonThreadSafeCleaner;

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

		SingletonMostCommon singletonMostCommon1 = SingletonMostCommon.getInstance();

		System.out.println("SingletonMostCommon  Instance 1 : " + ((singletonMostCommon1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonMostCommon singletonMostCommon2 = SingletonMostCommon.getInstance();

		System.out.println("SingletonMostCommon  Instance 2 : " + ((singletonMostCommon2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();

		System.out.println("SingletonThreadSafe  Instance 1 : " + ((singletonThreadSafe1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();

		System.out.println("SingletonThreadSafe  Instance 2 : " + ((singletonThreadSafe2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafeCleaner singletonThreadSafeCleaner1 = SingletonThreadSafeCleaner.getInstance();

		System.out.println("SingletonThreadSafeCleaner  Instance 1 : " + ((singletonThreadSafeCleaner1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonThreadSafeCleaner singletonThreadSafeCleaner2 = SingletonThreadSafeCleaner.getInstance();

		System.out.println("SingletonThreadSafeCleaner  Instance 2 : " + ((singletonThreadSafeCleaner2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonBestPattern singletonBestPattern1 = SingletonBestPattern.getInstance();

		System.out.println("SingletonBestPattern  Instance 1 : " + ((singletonBestPattern1!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();

		SingletonBestPattern singletonBestPattern2 = SingletonBestPattern.getInstance();

		System.out.println("SingletonBestPattern  Instance 2 : " + ((singletonBestPattern2!=null)? "SUCCESS" : "FAILURE"));
		System.out.println();
	}
}