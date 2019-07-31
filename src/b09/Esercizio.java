package b09;

import java.util.ArrayList;

public class Esercizio {

	public static ArrayList<Integer> join(ArrayList<Integer> firstArrayList, ArrayList<Integer> secondArrayList) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(firstArrayList);
		result.addAll(secondArrayList);
		return result;
	}
}
