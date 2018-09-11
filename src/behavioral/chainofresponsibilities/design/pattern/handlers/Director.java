package behavioral.chainofresponsibilities.design.pattern.handlers;

import behavioral.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;

/**
 * Successor of Manager
 *
 * @author "Jigar Gosalia"
 *
 */
public class Director extends PurchasePower {
	private final double ALLOWABLE = 20 * base;

	public Director(final PurchasePower successor) {
		this.setSuccessor(successor);
	}

	@Override
	public void processRequest(final PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("Director will approve $" + request.getAmount());
		else if (successor != null)
			successor.processRequest(request);
	}
}