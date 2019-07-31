package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class S094 {
	public static void main(String[] args) {
		Collection<Integer> coll = emptyCollection(); // inizialmente abbiamo un collection vuota (emptyCollection è
														// come aCollection)

		coll.addAll(aCollection()); // aggiunge tutti i valori presenti nella collezione creata con il metodo
									// aCollection creato da me nelle ultime righe (questo metodo crea un array
									// attraverso il metodo asList)
		System.out.println(coll);

		if (coll.contains(-2233)) {
			System.out.println("-2233 is there");
		}

		if (coll.equals(aCollection())) {
			System.out.println("Same collection");
		}

		coll.add(42);
		if (!coll.equals(aCollection())) {
			System.out.println("Different collection");
		}

		System.out.println("The collection has " + coll.size() + " elements");

		Iterator<Integer> it = coll.iterator();
		System.out.print("{ ");
		while (it.hasNext()) { // finché l'iteratore ha un successore prendimi il prossimo elemento e mettimelo
								// dentro
			System.out.print(it.next() + " "); // next è il metodo che mi prende effettivamente il valore che con
												// hasNext ho chiesto se esistesse
		}
		System.out.println('}');

		// da quando c'è il for each si preferisce usare quello invece dell'iteratore e
		// si fa così:
		System.out.print("{ ");
		for (Integer value : coll) {
			System.out.println(value + " ");
		}
		System.out.println('}');
		
		
		coll.remove(-5);

		Integer[] values = coll.toArray(new Integer[coll.size()]);
		System.out.println(Arrays.toString(values));

		coll.retainAll(aCollection());
		System.out.println(coll);

		coll.clear();
		System.out.println("Collection is empty? " + coll.isEmpty());
	}

	private static Collection<Integer> emptyCollection() {
		Collection<Integer> result = new ArrayList<Integer>();

		return result;
	}

	private static Collection<Integer> aCollection() {
		return Arrays.asList(12, 18, -5, -2233);
	}

}
