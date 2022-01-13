package fr.dauphine.javaavance.td6;

public class MyList {
	private Cell firstCell ;
	private int size ;
	
	
	
	public MyList() {
		size =  0 ;
	}
	public void add(String s) {
		if(s == null) {
			throw new NullPointerException();
		}
		if(firstCell == null) {
			firstCell = new Cell(s);
			size ++ ;
		}
		else {
			firstCell = new Cell(s,firstCell);
			size++;
		}
	}
	
	public void add(String s, int index) {
		if(index > size) {
			throw new IllegalArgumentException() ;
		}
		Cell c ;
		c = firstCell ;
		if (index == 0) {
			firstCell = new Cell(s, firstCell) ;
			size ++ ;
		}
		else {
			for(int i = 0 ; i <= index ; i ++) {

				if( i == index - 1) {
					
					c.setSucc(new Cell(s,c.getSucc()));
					size ++ ;
					break;
				}
				else if(i != index) {
					c = c.getSucc() ;
				}
			}
		}

		
	}
	
	public void addLast(String s) {
		if(s == null) {
			throw new NullPointerException();
		}
		Cell c ;
		c = firstCell ;
		if(c == null) {
			add(s);
		}
		else {
			while(true) {
				if(c.getSucc() == null) {
					c.setSucc(new Cell (s));
					this.size ++ ;
					break ;
				}
				c = c.getSucc() ;
				
			}
		}

	}
	
	public int size() {
		return size;
	
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Cell c ;
		c = firstCell ;
		while(true) {
			if(c.getSucc() != null) {
				sb.append(c.getValue() + ", ");
				c = c.getSucc();
			}
			else {
				sb.append(c.getValue());
				break ;
			}
		}
		return sb.toString();
	}
	
	public String get(int i) {
		if(i >= size || size == 0 || i < 0) {
			throw new IllegalArgumentException() ;
		}
		Cell c ;
		c = firstCell ;
		
		for(int j = 0 ; j <= i ; j ++) {
				if( i == j ) {
					return c.getValue();
				}
				c = c.getSucc() ;
		}
		return null ;
	}
	
	public int sumLetter() {
		int sum = 0 ;
		Cell c ;
		c = firstCell ;
		while(true) {
			if(c.getSucc() != null) {
				sum += c.getValue().length();
				c = c.getSucc();
				
			}
			else {
				sum += c.getValue().length();
				break ;
			}
		}
		return sum ;
		
	}
	
}
