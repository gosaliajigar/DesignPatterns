/**
 * 
 */
package behavioral.visitor.design.pattern.interfaces;

/**
 * Item interface.
 * 
 * @author "Jigar Gosalia"
 *
 */
public interface Visitable {

	public void accept(Visitor visitor);

}
