package behavioral.visitor.design.pattern.interfaces;

import behavioral.visitor.design.pattern.items.Circle;
import behavioral.visitor.design.pattern.items.Parallelogram;
import behavioral.visitor.design.pattern.items.Rectangle;
import behavioral.visitor.design.pattern.items.Square;
import behavioral.visitor.design.pattern.items.Trapezoid;
import behavioral.visitor.design.pattern.items.Triangle;

/**
 * Visitor Interface
 * 
 * @author "Jigar Gosalia"
 *
 */
public interface Measurable {

	public void visit(Square square);

	public void visit(Rectangle rectangle);

	public void visit(Triangle triangle);

	public void visit(Parallelogram parallelogram);

	public void visit(Trapezoid trapeziod);

	public void visit(Circle circle);
}
