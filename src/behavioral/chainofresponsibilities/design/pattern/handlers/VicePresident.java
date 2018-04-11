package behavioral.chainofresponsibilities.design.pattern.handlers;

import behavioral.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class VicePresident extends PurchasePower {

	private final double ALLOWABLE = 40 * base;

	/**
	 * @param successor
	 */
	public VicePresident(PurchasePower successor) {
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
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("Vice President will approve $"
					+ request.getAmount());
		else if (successor != null)
			successor.processRequest(request);
	}
}