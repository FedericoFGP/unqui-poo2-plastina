package ar.edu.unq.po2.tp3;
import ar.edu.unq.po2.tp3.Point;

public class Rectangle {
	Point leftInferiorCorner;
	Point rightInferiorCorner;
	Point leftSuperiorCorner; 
	Point rightSuperiorCorner;
	private double width;
	private double height;
	
	
	public Rectangle(Point initialPoint,  int width, int height) {
		this.leftInferiorCorner = initialPoint;
		this.rightInferiorCorner = new Point( initialPoint.getX() + width, initialPoint.getY());
		this.leftSuperiorCorner = new Point(initialPoint.getX(), initialPoint.getY() + height);
		this.rightSuperiorCorner = new Point(initialPoint.getX() + width,initialPoint.getY() + height);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		
	}
	
	public double getArea() {
		//Se podria calcular tambien sacando las diferencias entre las coordenadas de cada punto
		return width * height;
	}
	
	public double getPerimetro() {
		return width * 2  + height * 2;
	}
	
	public boolean isHorizontal() {
		return width > height;
	}
	
	public boolean isVertical() {
		return height > width;
	}
	
	public String isVerticalOrHorizontal() {
		return this.isHorizontal() ? "Es horizontal." : this.isVertical() ? "Es vertical" : "Es un cuadrado";
	}
}
