package fr.dauphine.javaavance.td6;

public class Main {

	public static void main(String[] args) {
		MyList l = new MyList ();

        l.add("cheval");

        l.add("avion");
        l.addLast("voiture");
        System.out.println(l.toString());
        l.add("moto", 3);
        System.out.println(l.size());

        System.out.println(l.toString());

	}

}
