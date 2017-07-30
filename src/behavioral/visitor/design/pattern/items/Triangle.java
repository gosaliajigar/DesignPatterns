package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.interfaces.Visitable;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Triangle implements Visitable {

	private int side1;

	private int side2;

	private int side3;

	public int getSide1() {
		return side1;
	}

	public int getSide2() {
		return side2;
	}

	public int getSide3() {
		return side3;
	}

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
