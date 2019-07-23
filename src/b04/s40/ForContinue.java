package b04.s40;

public class ForContinue {
    public static void main(String[] args) {
       
        int [] array = {3, 6 , 8, 5, 9};
        for (int i = 0; i < array.length; i++) {
        	if (i % 2 !=0) {
        		continue;
        	}
        	if (array[i] % 3 == 0) {
        	System.out.println(array[i]);
        	}
        }
    }
}
