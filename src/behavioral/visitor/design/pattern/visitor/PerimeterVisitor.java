package behavioral.visitor.design.pattern.visitor;

import behavioral.visitor.design.pattern.interfaces.Visitor;
import behavioral.visitor.design.pattern.items.Circle;
import behavioral.visitor.design.pattern.items.Parallelogram;
import behavioral.visitor.design.pattern.items.Rectangle;
import behavioral.visitor.design.pattern.items.Square;
import behavioral.visitor.design.pattern.items.Trapezoid;
import behavioral.visitor.design.pattern.items.Triangle;

/**
 * @author "Jigar Gosalia"
 *
 */
public class PerimeterVisitor implements Visitor {

	/* (non-Javadoc)
	 * @see behavioral.visitor.design.pattern.interfaces.Measurable#visit(behavioral.visitor.design.pattern.items.Square)
	 */
	@Override
	public void visit(Square square) {
		System.out.println("Perimeter of Square        : " + (4 * square.getSide()));
	}

	/* (non-Javadoc)
	 * @see behavioral.visitor.design.pattern.interfaces.Measurable#visit(behavioral.visitor.design.pattern.items.Rectangle)
	 */
	@Override
	public void visit(Rectangle rectangle) {
		System.out.println("Perimeter of Rectangle     : " + (2 * (rectangle.getLength() + rectangle.getWidth())));
	}

	/* (non-Javadoc)
	 * @see behavioral.visitor.design.pattern.interfaces.Measurable#visit(behavioral.visitor.design.pattern.items.Triangle)
	 */
	@Override
	public void visit(Triangle triangle) {
		System.out.println("Perimeter of Triangle      : " + (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()));
	}

	/* (non-Javadoc)
	 * @see behavioral.visitor.design.pattern.interfaces.Measurable#visit(behavioral.visitor.design.pattern.items.Parallelogram)
	 */
	@Override
	public void visit(Parallelogram parallelogram) {
		System.out.println("Perimeter of Parallelogram : " + (2 * (parallelogram.getSide1() + parallelogram.getSide2())));
	}

	/* (non-Javadoc)
	 * @see behavioral.visitor.design.pattern.interfaces.Measurable#visit(behavioral.visitor.design.pattern.items.Trapezoid)
	 */
	@Override
	public void visit(Trapezoid trapeziod) {
		System.out.println("Perimeter of Trapezoid     : " + (trapeziod.getHeight() * ((trapeziod.getBase1() + trapeziod.getBase2()) / 2)));
	}

	/* (non-Javadoc)
	 * @see behavioral.visitor.design.pattern.interfaces.Measurable#visit(behavioral.visitor.design.pattern.items.Circle)
	 */
	@Override
	public void visit(Circle circle) {
		System.out.println("Perimeter of Circle        : " + ((2 * 22 * circle.getRadius() / 7)));
	}

}
