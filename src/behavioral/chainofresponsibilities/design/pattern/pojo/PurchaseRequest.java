package behavioral.chainofresponsibilities.design.pattern.pojo;

/**
 *
 * Java PoJo
 *
 * @author "Jigar Gosalia"
 *
 */
public class PurchaseRequest {

	/**
     *
     */
	private int number;
	/**
     *
     */
	private double amount;
	/**
     *
     */
	private String purpose;

	/**
	 * @param number
	 * @param amount
	 * @param purpose
	 */
	public PurchaseRequest(final int number, final double amount, final String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}

	/**
	 * @return
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amt
	 */
	public void setAmount(final double amt) {
		amount = amt;
	}

	/**
	 * @return
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * @param reason
	 */
	public void setPurpose(final String reason) {
		purpose = reason;
	}

	/**
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param num
	 */
	public void setNumber(final int num) {
		number = num;
	}
}