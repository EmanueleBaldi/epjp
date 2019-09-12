package ex;

import java.util.ArrayList;

public class Armstrong{
public static boolean isArmstrong(int value) {
	int confronto = value;
	ArrayList<Integer> armstrong = new ArrayList<Integer> ();
	while (value != 0) {
		int cifra = value%10;
		 value = value/10;
		armstrong.add(cifra);
	}
	int k=armstrong.size();
	int somma = 0;
	for (Integer a:armstrong) {
		int kPow = (int) Math.pow(a,k);
		somma = somma + kPow;
	}
	if (somma==confronto) {
			return true; 
	} else {
		return false;
	}
}
}