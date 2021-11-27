package fr.dauphine.javaavance.td1;

public class Circle {
	private final Point center ;
	private final double radius ;

	public Circle(Point center, double radius) {
		this.center = new Point(center) ;
		this.radius = radius ;	
	}



	public void translate(int dx, int dy) {
		center.translate(dx,dy) ;
	}

	public Point getCenter() {
		return new Point(center);
	}

	public double area() {
		return  Math.PI * Math.pow(radius, 2) ; 
	}

	@Override
	public String toString() {
		return "Circle with an area of : " + area();
	}

	public boolean contains(Point p) {
		double distance = Math.sqrt( Math.pow(center.getY() - p.getY(),2) + Math.pow(center.getX() - p.getX(),2)) ;
		return radius >= distance ;
	}

	public static boolean contains(Point p, Circle...circles) {
		for (Circle c : circles) {
			if(c.contains(p)) {
				return true ;
			}
		}
		return false ;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		long temp;
		temp = Double.doubleToLongBits(radius);
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
		Circle other = (Circle) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	public double getRadius() {
		return this.radius ;
	}


}
