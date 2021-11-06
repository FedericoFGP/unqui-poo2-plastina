package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sum(Point p) {
		return new Point(this.x + p.x, this.y + p.y);
	}
}
