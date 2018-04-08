package structural.proxy.design.pattern.implementations;

import java.util.LinkedList;
import java.util.List;

import structural.proxy.design.pattern.interfaces.Activity;
import structural.proxy.design.pattern.processor.MainProcessor;

/**
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Account implements Activity {

	private int accountNumber;

	private List<String> permissions;

	private List<String> history;

	public int getAccountNumber() {
		return accountNumber;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public List<String> getHistory() {
		return history;
	}

	public Account(int accountNumber, List<String> permissions, List<String> history) {
		this.accountNumber = accountNumber;
		this.permissions = new LinkedList<String>();
		this.permissions.addAll(permissions);
		this.history = new LinkedList<String>();
		this.history.addAll(history);
	}

	public Account(int accountNumber) {
		// In real life, account object will be retrieved given account number.
		this(MainProcessor.accounts.get(accountNumber).getAccountNumber(), 
				MainProcessor.accounts.get(accountNumber).getPermissions(), 
				MainProcessor.accounts.get(accountNumber).getHistory());
	}

	/* (non-Javadoc)
	 * @see structural.proxy.design.pattern.interfaces.Activity#printHistory()
	 */
	@Override
	public void printHistory() {
		int count = 0;
		System.out.println("Account Number: " + accountNumber);
		System.out.println("History: ");
		for (String record: getHistory()) {
			System.out.println(count++ + ". " + record);
		}
	}

	public void printPermissions() {
		int count = 0;
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Permissions: ");
		for (String record: getPermissions()) {
			System.out.println(count++ + ". " + record);
		}
	}
}
