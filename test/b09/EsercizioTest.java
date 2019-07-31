package b09;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EsercizioTest {

	@Test
	void sumArrayList() {
		ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
		firstArrayList.add(3);
		firstArrayList.add(7);
		firstArrayList.add(12);
		ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
		secondArrayList.add(1);
		secondArrayList.add(5);
		secondArrayList.add(6);
		
	
		ArrayList<Integer> actual = Esercizio.join(firstArrayList, secondArrayList);
	firstArrayList.addAll(secondArrayList);
	assertEquals(actual, firstArrayList);
	}
}
