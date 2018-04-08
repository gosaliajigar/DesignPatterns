package structural.proxy.design.pattern.processor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import structural.proxy.design.pattern.implementations.Account;
import structural.proxy.design.pattern.interfaces.Activity;
import structural.proxy.design.pattern.proxy.ProxyAccount;

/**
 * Proxy Design Pattern : Structural Design Pattern<br>
 * <br>
 * Provide a surrogate or place holder for another object to control access to
 * it. It is used when we want to provide controlled access of a functionality.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcessor {

	public static Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	static {
		// In real life, account object will be retrieved given account number.
		accounts.put(1234, new Account(1234, Arrays.asList("READ", "WRITE",
				"EXECUTE"), Arrays.asList("CREATED", "UPDATED 01",
				"UPDATED 02", "UPDATED 03", "UPDATED 04", "UPDATED 05",
				"UPDATED 06", "UPDATED 07", "UPDATED 08", "UPDATED 09",
				"UPDATED 10", "UPDATED 11", "UPDATED 12", "UPDATED 13",
				"UPDATED 14", "UPDATED 15", "UPDATED 16", "UPDATED 17",
				"DELETED 18")));
	}

	public static void main(String[] args) {

		Activity proxy = new ProxyAccount(1234);

		System.out.println(" --- Actual Account --- ");
		accounts.get(1234).printHistory();

		System.out.println();

		System.out.println(" --- Proxy Account --- ");
		proxy.printHistory();
	}
}
