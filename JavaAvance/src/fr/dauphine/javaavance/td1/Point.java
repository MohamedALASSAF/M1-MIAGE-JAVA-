package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	private double  x,y ;

	private static int nbPoint = 0 ;

	public Point(double x, double y) {
		this.x = x ;
		this.y = y ;
		nbPoint ++ ;
	}
	public Point (Point p2) {
		this(p2.getX(), p2.getY()) ;
	}

	public static void main(String[] args) {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);

		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1.isSameAs(p3));


		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

	}

	public static int getNbPoint() {
		return nbPoint ;
	}


	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public boolean isSameAs(Point p) {
		return p.getX() == this.x && p.getY() == this.y ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	public void translate(double dx, double dy) {
		x += dx ;
		y += dy ;
	}
	/*
	public Point translate (double dx, double dy) {
	 return new Point(x+dx,y+dy) ;
	 }
	 */






}
