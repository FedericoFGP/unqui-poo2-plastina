package ar.edu.unq.po2.tp3;

public class Square extends Rectangle {

	public Square(Point initialPoint, int large) {
		super();
		this.leftInferiorCorner = initialPoint;
		this.rightInferiorCorner = new Point(initialPoint.getX() + large, initialPoint.getY());
		this.leftSuperiorCorner = new Point(initialPoint.getX() , initialPoint.getY() + large );
		this.rightSuperiorCorner = new Point(initialPoint.getX() + large, initialPoint.getY());
	}

}
