package b04.s40;

public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
        	array[i]= "";
        }
        for (String item : array) {	
            System.out.println(item.length());
        }
		System.out.println(">" + array[2] + "<");
    }
}
