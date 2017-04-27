package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Measurable;
import behavioral.visitor.design.pattern.interfaces.Shape;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Circle implements Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void accept(Measurable measurable) {
		measurable.visit(this);
	}
}
