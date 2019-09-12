package ex;

public class HammingDistance {
	
	public static int hammingDistance(String left, String right) {
		int distance = 0;
		if (left.length() != right.length()) {
			throw new IllegalArgumentException();
		} else {
		
		
		for (int i=0; i< left.length(); i++) {
			if ( left.charAt(i) == right.charAt(i)) {
				continue;
			} else {
				distance ++;
			}
	}
	}
		return distance;
}
}