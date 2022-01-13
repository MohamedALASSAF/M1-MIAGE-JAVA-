package fr.dauphine.javaavance.td6_ex2;

public class MyList<T> {
	private Cell<T> firstCell ;
	private int size ;
	
	
	
	public MyList() {
		size =  0 ;
	}
	public void add(T s) {
		if(s == null) {
			throw new NullPointerException();
		}
		if(firstCell == null) {
			firstCell = new Cell<>(s);
			size ++ ;
		}
		else {
			firstCell = new Cell<>(s,firstCell);
			size++;
		}
	}
	
	public void add(T s, int index) {
		if(index > size) {
			throw new IllegalArgumentException() ;
		}
		Cell<T> c = firstCell ;
		if (index == 0) {
			firstCell = new Cell<>(s, firstCell) ;
			size ++ ;
		}
		else {
			for(int i = 0 ; i <= index ; i ++) {
				

				if( i == index - 1) {
		
					c.setSucc(new Cell<>(s,c.getSucc()));
					size ++ ;
					break;
				}
				else if(i != index) {
					c = c.getSucc() ;
				}
			}
		}

		
	}
	
	public void addLast(T s) {
		if(s == null) {
			throw new NullPointerException();
		}
		Cell<T> c = firstCell ;
		if(c == null) {
			add(s);
		}
		else {
			while(true) {
				if(c.getSucc() == null) {
					c.setSucc(new Cell<> (s));
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
		Cell<T> c  = firstCell ;
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
	
	public T get(int i) {
		if(i >= size || size == 0 || i < 0) {
			throw new IllegalArgumentException() ;
		}
		Cell<T> c = firstCell ;
		
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
		Cell<T> c ;
		c = firstCell ;
		while(true) {
			if(c.getSucc() != null) {
				sum += ((String) c.getValue()).length();
				c = c.getSucc();	
			}
			else {
				sum += ((String) c.getValue()).length();
				break ;
			}
		}
		return sum ;
		
	}
	
	public boolean contrain(T value) {
		if(firstCell == null) {
			throw new IllegalStateException() ;
		}
		else if(value == null) {
			throw new NullPointerException() ;
		}
		Cell<T> c ;
		c = firstCell ;
		while(c.getSucc() != null) {
			if(c.getValue().equals(value)) {
				return true ;
			}
			c = c.getSucc();	
		}
		return false ;
	}
	
}
