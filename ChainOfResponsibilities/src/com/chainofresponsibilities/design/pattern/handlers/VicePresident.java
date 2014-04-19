package com.chainofresponsibilities.design.pattern.handlers;

import com.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class VicePresident extends PurchasePower {
	/**
	 * 
	 */
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
	 * @see com.chainofresponsibilities.design.pattern.handlers.PurchasePower#
	 * processRequest(PurchaseRequest)
	 */
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("Vice President will approve $"
					+ request.getAmount());
		else if (successor != null)
			successor.processRequest(request);
	}
}