package behavioral.chainofresponsibilities.design.pattern.pojo;

/**
 *
 * Java PoJo
 *
 * @author "Jigar Gosalia"
 *
 */
public class PurchaseRequest {
	private int number;
	private double amount;
	private String purpose;

	public PurchaseRequest(final int number, final double amount, final String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}

	public double getAmount() { return amount; }

	public void setAmount(final double amt) { amount = amt; }

	public String getPurpose() { return purpose; }

	public void setPurpose(final String reason) { purpose = reason;	}

	public int getNumber() { return number; }

	public void setNumber(final int num) { number = num; }
}