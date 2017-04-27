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
public interface Shape {

	public void accept(Measurable measurable);

}
