package fr.dauphine.javaavance.alassafmohamed.iterable;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

	private Integer end ;
	private Integer pointer ;
	
	

	public MyIterator(Integer begin, Integer end) {
		super();
		this.end = end;
		this.pointer = begin ;
	}

	@Override
	public boolean hasNext() {
		if (pointer <= end) {
			return true ; 
		}
		return false ;
	}

	@Override
	public Integer next() {
		if(hasNext())
			return pointer++;
		return null;
	}

}
