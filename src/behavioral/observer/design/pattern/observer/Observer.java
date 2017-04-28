package behavioral.observer.design.pattern.observer;

import behavioral.observer.design.pattern.subject.Stock;

/**
 * Observer interface that watches changes in Subject (here Stock).
 * 
 * @author "Jigar Gosalia"
 *
 */
public interface Observer {

	// method to update the observer, used by subject
	public void update(float delta);

	// attach with subject to observe
	public void setSubject(Stock stock);
}
