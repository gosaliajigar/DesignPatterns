package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Measurable;
import behavioral.visitor.design.pattern.interfaces.Shape;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Square implements Shape {

	private int side;

	public int getSide() {
		return side;
	}

	public Square(int side) {
		this.side = side;
	}

	@Override
	public void accept(Measurable measurable) {
		measurable.visit(this);
	}
}
