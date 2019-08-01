package b09;

import java.util.ArrayList;

public class Tabella {

	private ArrayList<Integer> data = new ArrayList<>();

	public void add(int value) {
		data.add(value);
	}

	public boolean check(int value) {
		data.contains(value);
		return true;
	}

	public void getData() {
		ArrayList<Integer> nuovo = new ArrayList<>();
		nuovo = data;
	}
}