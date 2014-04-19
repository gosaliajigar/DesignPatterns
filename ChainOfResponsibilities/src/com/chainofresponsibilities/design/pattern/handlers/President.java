package com.chainofresponsibilities.design.pattern.handlers;

import com.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;

/**
 * @author "Jigar Gosalia"
 * 
 */
public class President extends PurchasePower {
	/**
	 * 
	 */
	private final double ALLOWABLE = 60 * base;

	/**
	 * 
	 */
	public President() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.chainofresponsibilities.design.pattern.handlers.PurchasePower#
	 * processRequest
	 * (com.chainofresponsibilities.design.pattern.pojo.PurchaseRequest)
	 */
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out
					.println("President will approve $" + request.getAmount());
		else
			System.out.println("Your request for $" + request.getAmount()
					+ " needs a board meeting!");
	}
}