package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long somma = 0;
		if (first > 0 && first < last) {
			for (int i = first; i <= last; i++) {
				somma = somma + i;
			}
			return somma;
		} else if (first < 0 || first > last) {
			return 0;
		} else {
			return first;
		}
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long sommaPari = 0;
		if (first > 0 && first < last) {
			for (int i = first; i <= last; i++) {
				if (i % 2 == 0) {
					sommaPari = sommaPari + i;
				} else {
					sommaPari = sommaPari + 0;
				}
			}
			return sommaPari;
		} else if (first < 0 || first > last) {
			return 0;
		} else {
			return first;
		}
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if (value < 0 || value > 20) {
			return 0;
		} else if (value < 2) {
			return 1;
		}

		long fattoriale = value;

		for (int i = value - 1; i > 0; i--) {
			fattoriale = fattoriale * i;
		}
		return fattoriale;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value == 0) {
			return 0;
		} else if (value == 1) {
			return 1;
		} else if (value < 0) {
			return 0;
		} else if (value > 20) {
			return 0;
		}

		long fibo = 0;
		long a = 0;
		long b = 1;
		for (int i = 2; i <= value; i++) {

			fibo = a + b;
			a = b;
			b = fibo;

		}
		return fibo;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[5][5];

		for (int i = 1; i <= value - 1; i++) {
			for (int j = 1; j <= value; j++) {
				result[i][j] = i * j;
			}

		}

		return result;
	}
}
