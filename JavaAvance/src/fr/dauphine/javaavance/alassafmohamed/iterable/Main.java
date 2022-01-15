package fr.dauphine.javaavance.alassafmohamed.iterable;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Iterator<Integer> it= Panel.panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
		
		for(int i:Panel.panel2(1,5))
			System.out.println(i);
	}

}
