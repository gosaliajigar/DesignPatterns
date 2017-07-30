package behavioral.visitor.design.pattern.processor;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.interfaces.Visitable;
import behavioral.visitor.design.pattern.items.Circle;
import behavioral.visitor.design.pattern.items.Parallelogram;
import behavioral.visitor.design.pattern.items.Rectangle;
import behavioral.visitor.design.pattern.items.Square;
import behavioral.visitor.design.pattern.items.Trapezoid;
import behavioral.visitor.design.pattern.items.Triangle;
import behavioral.visitor.design.pattern.visitor.PerimeterVisitor;

/**
 * Visitor Design Pattern: Behavioral Design Pattern<br>
 * <br>
 * Visitor pattern is used when we have to perform an operation on a group of
 * similar kind of Objects. With the help of visitor pattern, we can move the
 * operational logic from the objects to another class.
 * 
 * As per the pattern, element object has to accept the visitor object so that
 * visitor object handles the operation on the element object.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor visitor = new PerimeterVisitor();

		Visitable[] visitables = new Visitable[]{
				new Square(10),
				new Triangle(10, 20, 30),
				new Rectangle(10, 10),
				new Parallelogram(20, 50),
				new Trapezoid(10, 20, 30),
				new Circle(7)};

		for (Visitable visitable: visitables) {
			visitable.accept(visitor);
		}
	}
}
