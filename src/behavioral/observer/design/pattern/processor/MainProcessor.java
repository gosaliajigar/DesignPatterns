package behavioral.observer.design.pattern.processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import behavioral.observer.design.pattern.observer.Observer;
import behavioral.observer.design.pattern.observers.FacebookStockObserver;
import behavioral.observer.design.pattern.observers.GoogleStockObserver;
import behavioral.observer.design.pattern.observers.LinkedInStockObserver;
import behavioral.observer.design.pattern.subject.Stock;

/**
 * Observer Design Pattern: Behavioral Design Pattern<br>
 * <br>
 * Define a one-to-many dependency between objects so that when one object
 * changes state, all its dependents are notified and updated automatically.
 * 
 * Subject contains a list of observers to notify of any change in it’s state,
 * so it should provide methods using which observers can register and
 * unregister themselves.<br>
 * <br>
 * Subject also contain a method to notify all the observers of any change and
 * either it can send the update while notifying the observer or it can provide
 * another method to get the update.<br>
 * <br>
 * Observer should have a method to set the object to watch and another method
 * that will be used by Subject to notify them of any updates.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcessor {

	private static Random randomStock = new Random();

	private static Random randomSpike = new Random();

	private static Random randomIncDec = new Random();

	private static List<Stock> stocks = new ArrayList<Stock>();

	private static List<Observer> observers = new ArrayList<Observer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createObservers();

		printStocks();

		for (int count = 0; count < 50; count++) {
			Stock stock = stocks.get(randomStock.nextInt(3));
			stock.updatePrice(getNewStockPrice(stock.getPrice()));
		}

		printObservers();
	}

	private static void createObservers() {
		Stock google = new Stock("GOOGL", 892);
		Stock facebook = new Stock("FB", 148);
		Stock linkedIn = new Stock("LNKD", 196);
		stocks.addAll(Arrays.asList(google, facebook, linkedIn));
		observers.addAll(Arrays.asList(new GoogleStockObserver(google), new FacebookStockObserver(facebook), new LinkedInStockObserver(linkedIn)));
	}

	private static void printStocks() {
		System.out.println("------------------------------");
		for (Stock stock : stocks) {
			System.out.println(stock);
		}
		System.out.println("------------------------------");
	}

	private static void printObservers() {
		System.out.println("------------------------------");
		for (Observer observer : observers) {
			System.out.println(observer);
		}
		System.out.println("------------------------------");
	}

	private static float getNewStockPrice(float price) {
		float spike = randomSpike.nextInt(2);
		float multiplier = (((randomIncDec.nextInt(100)%2) == 0) ? (1 + (spike/100)) : (1 - (spike/100)));
		return (price * multiplier);
	}
}
