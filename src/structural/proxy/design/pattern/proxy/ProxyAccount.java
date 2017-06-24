package structural.proxy.design.pattern.proxy;

import java.util.List;

import structural.proxy.design.pattern.implementations.Account;
import structural.proxy.design.pattern.interfaces.Activity;

/**
 * ProxyAccount to be shared with client so that client have limited access to
 * Account features.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class ProxyAccount implements Activity {

	private Account account;

	public ProxyAccount(Account account) {
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see structural.proxy.design.pattern.interfaces.Activity#printHistory()
	 */
	@Override
	public void printHistory() {
		int count = 1;
		List<String> history = account.getHistory();
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("History: ");
		for (String record: history) {
			// display only 1st 10 transactions
			if (count <= 10) {
				System.out.println(count++ + ". " + record);
			} else {
				break;
			}
		}
	}
}
