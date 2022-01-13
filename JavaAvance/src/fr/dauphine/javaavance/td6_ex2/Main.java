package fr.dauphine.javaavance.td6_ex2;

public class Main {

	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();
		list.add(3);
		list.addLast(5);
		list.add(4, 1);
		
		System.out.println(list);
		System.out.println(list.contrain(4));
	}

}
