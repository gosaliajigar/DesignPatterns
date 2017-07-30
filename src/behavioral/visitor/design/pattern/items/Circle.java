package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.interfaces.Visitable;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Circle implements Visitable {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
