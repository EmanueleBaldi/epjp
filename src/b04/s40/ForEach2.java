package b04.s40;

public class ForEach2 {
	public static void main(String[] args) {

		int k = 5;
		int[] values = { 7, 5, 11 };
		for (int value : values) {
			value += k;
		}
		for (int value :values) {
			System.out.println(value + " ");	
		}
		
	}
}