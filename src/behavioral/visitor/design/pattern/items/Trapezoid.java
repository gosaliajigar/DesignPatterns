package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.interfaces.Visitable;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Trapezoid implements Visitable {

	private int height;

	private int base1;

	private int base2;

	public int getHeight() {
		return height;
	}

	public int getBase1() {
		return base1;
	}

	public int getBase2() {
		return base2;
	}

	public Trapezoid(int height, int base1, int base2) {
		this.height = height;
		this.base1 = base1;
		this.base2 = base2;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
