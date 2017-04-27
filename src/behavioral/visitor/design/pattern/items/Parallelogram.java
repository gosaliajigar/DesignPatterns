package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Measurable;
import behavioral.visitor.design.pattern.interfaces.Shape;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Parallelogram implements Shape {

	private int side1;

	private int side2;

	public int getSide1() {
		return side1;
	}

	public int getSide2() {
		return side2;
	}

	public Parallelogram(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public void accept(Measurable measurable) {
		measurable.visit(this);
	}
}
