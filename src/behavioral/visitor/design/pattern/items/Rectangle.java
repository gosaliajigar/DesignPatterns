package behavioral.visitor.design.pattern.items;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.interfaces.Visitable;

/**
 * @author "Jigar Gosalia"
 *
 */
public class Rectangle implements Visitable {

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
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
