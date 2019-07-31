package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S095 {
	public static void main(String[] args) {
		List<Integer> list = aList(); // aList metodo creato per creare un array con asList in fondo al codice
		System.out.println(list);

		// con questo metodo ci creaiamo un ArrayList  senza passare da aList e quindi asList
		List <Integer> l2 = new ArrayList<>();
		l2.add(12);
		l2.add(18);
		l2.add(-5);
		l2.add(-997);

		System.out.println("At index 2: " + list.get(2));
		list.add(2, -997); // mette nella posizione con indice 2 con il valore -997 e shifta tutti quelli successivi
		System.out.println("Index of -997: " + list.indexOf(-997));

		list.remove(3);
		list.set(3, 42);
		System.out.println(list);
	}

	private static List<Integer> aList() {
		return new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233)); // asList è un metodo che permette di creare
																			// una lista ma con size non modificabile
	}
}
