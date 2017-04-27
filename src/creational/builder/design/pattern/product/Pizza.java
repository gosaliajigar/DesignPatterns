package creational.builder.design.pattern.product;

/**
 * Product Pizza
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Pizza {

	/**
	 * 
	 */
	private String dough;

	/**
	 * 
	 */
	private String sauce;

	/**
	 * 
	 */
	private String toppings;

	/**
	 * @return
	 */
	public String getDough() {
		return this.dough;
	}

	/**
	 * @param dough
	 */
	public void setDough(final String dough) {
		this.dough = dough;
	}

	/**
	 * @return
	 */
	public String getSauce() {
		return this.sauce;
	}

	/**
	 * @param sauce
	 */
	public void setSauce(final String sauce) {
		this.sauce = sauce;
	}

	/**
	 * @return
	 */
	public String getToppings() {
		return this.toppings;
	}

	public void setToppings(final String toppings) {
		this.toppings = toppings;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ("Dough-Type : " + this.dough + "\n" + "Sauce-Type : "
				+ this.sauce + "\n" + "Toppings-Type : " + this.toppings);
	}
}
