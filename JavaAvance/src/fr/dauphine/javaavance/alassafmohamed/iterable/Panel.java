package fr.dauphine.javaavance.alassafmohamed.iterable;

import java.util.*;


public class Panel {


	public static ListIterator<Integer> myPanel1(int i, int j) {
		//return new MyIterator(i, j);
		final int pointer = i ;
		final int end = j ;
		final int begin = i ;
		return new ListIterator<>() {
			private int p = pointer ;
			@Override
			public boolean hasNext() {
				
				if (p <= end) {
					return true ; 
				}
				return false ;
			}

			@Override
			public Integer next() {
				if(hasNext())
					return p++;
				return null;
			}

			@Override
			public boolean hasPrevious() {
				
				return p>begin;
			}

			@Override
			public Integer previous() {
				if(hasPrevious())
					return p--;
				return null;
			}

			@Override
			public int nextIndex() {
				if(hasNext())
					return p - begin + 1;
				return end + 1 - begin;
			}

			@Override
			public int previousIndex() {
				if(hasPrevious())
					return p - begin - 1;
				return - 1 ;
			}

			@Override
			public void remove() {
				throw new IllegalStateException() ;
				
			}

			@Override
			public void set(Integer e) {
				throw new IllegalStateException() ;
				
			}

			@Override
			public void add(Integer e) {
				throw new IllegalStateException() ;
				
			}
			
		};
	}

	
	public static Iterator<Integer> panel1(final int start, final int end) {
		return new Iterator<>() {
			int i = start;

			@Override
			public boolean hasNext() {
				return i <= end;
			}

			@Override
			public Integer next() {
				if (!hasNext())
					throw new NoSuchElementException();
				return i++;

			}
		};
	}
	
	public static Iterable<Integer> panel2(int i, int j) {
		
		return new Iterable<>() {
			@Override
			public Iterator<Integer> iterator() {
				
				return panel1(i,j);
			}
		};
	}

	public static AbstractList<Integer> panel(int start, int i) {
		if(start > i) {
			throw new IllegalArgumentException();
		}
		return new AbstractList<>() {
			
			private int begin = start ;
			private int end = i ;
			@Override
			public int size() {
				
				return end + 1 - begin ;
			}
			
			@Override
			public Integer get(int index) {
				if( index >= size()) {
					throw new IllegalArgumentException();
				}
				return begin + index;
			}
			
			/*
			public  ListIterator<Integer> listIterator(){
				return myPanel1(begin,end) ;
			}
			*/
			@Override
			public Iterator<Integer> iterator() {
				return panel1(start, end);
			}

		};
	}

}
