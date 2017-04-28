package behavioral.observer.design.pattern.observer;

import behavioral.observer.design.pattern.subject.Stock;

/**
 * Observer that watches changes in Subject (here Stock).
 * 
 * @author "Jigar Gosalia"
 *
 */
public class LinkedInStockObserver implements Observer {

	private Stock stock;

	private int count;

	public Stock getStock() {
		return stock;
	}

	public int getCount() {
		return count;
	}

	public LinkedInStockObserver (Stock stock) {
		this.setSubject(stock);
	}

	/* (non-Javadoc)
	 * @see behavioral.observer.design.pattern.observer.Observer#update()
	 */
	@Override
	public void update(float delta) {
		String change = "decreased";
		count++;
		if (delta > 0) {
			change = "increased";
		}
		System.out.printf("%-6s %s %.2f\n", stock.getSymbol(), change, delta);
	}

	/* (non-Javadoc)
	 * @see behavioral.observer.design.pattern.observer.Observer#setSubject(behavioral.observer.design.pattern.subject.Stock)
	 */
	@Override
	public void setSubject(Stock stock) {
		this.stock = stock;
		this.stock.register(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Observer [stock=" + stock + ", price Changed=" + count
				+ " times]";
	}

}
