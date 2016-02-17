package com.sircus.CompositionsPointsCartesiens;

public class Point2dim{
	private Point x;
	private Point y;
	
	
	public double getX() {
		return x.getPoint();
	}
	public void setX(Point x) {
		this.x = x;
	}
	
	
	public double getY() {
		return y.getPoint();
	}
	public void setY(Point y) {
		this.y = y;
	}
	public Point2dim()
	{
		
	}
	public Point2dim(double pX, double pY) { 
		 x = new Point(pX); 
		 y = new Point(pY);
		
		}
}
