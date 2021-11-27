package fr.dauphine.javaavance.td1;


public class Ring extends Circle {

	private double innerRadius ;

	public Ring(Point center, double r1, double r2)  {
		super(center, r1);
		if(r2>r1) {throw new IllegalArgumentException() ;}
		this.innerRadius = r2 ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(innerRadius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ring other = (Ring) obj;
		if (Double.doubleToLongBits(innerRadius) != Double.doubleToLongBits(other.innerRadius))
			return false;
		return true;
	} 



	@Override
	public String toString() {
		return "Ring with radius : " +super.getRadius() +" and inner radius : "+ this.innerRadius;
	}


	@Override 
	public boolean contains(Point p) {
		double distance = Math.sqrt( Math.pow(super.getCenter().getY() - p.getY(),2) 
				+ Math.pow(super.getCenter().getX() - p.getX(),2)) ;
		return innerRadius >= distance ;
	}

	public static boolean contains(Point p, Ring...rings) {
		for (Ring r : rings) {
			if(r.contains(p)) {
				return true ;
			}
		}
		return false ;
	}

}
