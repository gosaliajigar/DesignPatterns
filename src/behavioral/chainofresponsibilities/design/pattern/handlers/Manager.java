package behavioral.chainofresponsibilities.design.pattern.handlers;

import behavioral.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;

/**
 * Leaf most
 *
 * @author "Jigar Gosalia"
 *
 */
public class Manager extends PurchasePower {

	private final double ALLOWABLE = 10 * base;

	/**
	 * @param successor
	 */
	public Manager(final PurchasePower successor) {
		this.setSuccessor(successor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * behavioral.chainofresponsibilities.design.pattern.handlers.PurchasePower
	 * #processRequest
	 * (behavioral.chainofresponsibilities.design.pattern.pojo.PurchaseRequest)
	 */
	@Override
	public void processRequest(final PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("Manager will approve $" + request.getAmount());
		else if (successor != null)
			successor.processRequest(request);
	}
}