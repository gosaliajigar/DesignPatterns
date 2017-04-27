package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Measurable;
import behavioral.visitor.design.pattern.interfaces.Shape;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Rectangle implements Shape {

	private int length;

	private int width;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void accept(Measurable measurable) {
		measurable.visit(this);
	}
}
