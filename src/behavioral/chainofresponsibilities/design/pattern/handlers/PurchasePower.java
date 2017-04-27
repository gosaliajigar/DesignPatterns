package behavioral.chainofresponsibilities.design.pattern.handlers;

import behavioral.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;

/**
 * Abstract Class
 *
 * @author "Jigar Gosalia"
 *
 */
public abstract class PurchasePower {

	/**
     *
     */
	protected final double base = 500;

	/**
     *
     */
	protected PurchasePower successor;

	/**
	 * @param successor
	 */
	public void setSuccessor(final PurchasePower successor) {
		this.successor = successor;
	}

	/**
	 * @param request
	 */
	public abstract void processRequest(PurchaseRequest request);
}