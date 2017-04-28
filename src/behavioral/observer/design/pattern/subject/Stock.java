package behavioral.observer.design.pattern.subject;

import java.util.LinkedList;
import java.util.List;

import behavioral.observer.design.pattern.observer.Observer;

/**
 * Subject that will change and have attached observers watching for change.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Stock {

	private String symbol;

	private float price;

	private List<Observer> observers;

	public String getSymbol() {
		return symbol;
	}

	public float getPrice() {
		return price;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void updatePrice(float price) {
		float delta = this.price - price;
		this.price = price;
		if (Math.abs(delta) > 0) {
			notifyObservers(delta);
		}
	}

	public Stock(String symbol, float price) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.observers = new LinkedList<Observer>();
	}

	public void register(Observer observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	public void unregister(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	public void notifyObservers(float delta) {
		for (Observer observer : observers) {
			observer.update(delta);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stock [symbol=" + String.format("%-10s", symbol) + ", price=" + String.format("%.2f", price) + "]";
	}
}
