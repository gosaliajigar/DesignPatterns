package behavioral.chainofresponsibilities.design.pattern.processor;

import behavioral.chainofresponsibilities.design.pattern.handlers.Director;
import behavioral.chainofresponsibilities.design.pattern.handlers.Manager;
import behavioral.chainofresponsibilities.design.pattern.handlers.President;
import behavioral.chainofresponsibilities.design.pattern.handlers.VicePresident;
import behavioral.chainofresponsibilities.design.pattern.pojo.PurchaseRequest;


/**
 * Chain of Responsibilities : Behavioral Design Pattern<br>
 * <br>
 * Chain of Responsibilities let more than one object handle a request without
 * their knowing each other. Pass the request to chained objects until it has
 * been handled. One request should be handled by more than one object. Don't
 * know which object should handle a request, probably more than one object will
 * handle it automatically.
 *
 * @author "Jigar Gosalia"
 *
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		President president = new President();
		VicePresident vicePresident = new VicePresident(president);
		Director director = new Director(vicePresident);
		Manager manager = new Manager(director);

		PurchaseRequest teamEventRequest = new PurchaseRequest(1, 4999.99, "Team Event");
		manager.processRequest(teamEventRequest);
		PurchaseRequest bonusRequest = new PurchaseRequest(1, 9999.99, "Bonus for Employee");
		manager.processRequest(bonusRequest);
		PurchaseRequest teamBonusRequest = new PurchaseRequest(1, 19999.99, "Bonus for Team");
		manager.processRequest(teamBonusRequest);
		PurchaseRequest visitToClientRequest = new PurchaseRequest(1, 29999.99, "Visit to Client-Site");
		manager.processRequest(visitToClientRequest);
		PurchaseRequest buyingStocksRequest = new PurchaseRequest(1, 59999.99, "Buying Stocks");
		manager.processRequest(buyingStocksRequest);
	}
}
