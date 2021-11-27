package fr.dauphine.javaavance.td1;

import java.util.LinkedList;
import java.util.Objects;

public class PolyLine {
	private LinkedList<Point> points ;

	public PolyLine( ) {
		points = new LinkedList<>();
	}

	public void add(Point p) {
		Objects.requireNonNull(p);
		points.add(p) ;
	}

	public int nbPoint() {
		return points.size() ;
	}

	public boolean contains(Point p) {
		return points.contains(p) ;
	}

}
