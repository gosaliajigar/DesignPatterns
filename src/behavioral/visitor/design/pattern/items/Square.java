package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.interfaces.Visitable;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Square implements Visitable {

	private int side;

	public int getSide() {
		return side;
	}

	public Square(int side) {
		this.side = side;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
