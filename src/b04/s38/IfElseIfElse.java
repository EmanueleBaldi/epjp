package b04.s38;

public class IfElseIfElse {
    public static void main(String[] args) {
        int value = 0 ;
        
        if (value < 0) {
            System.out.println("negativo");
        } else if (value > 0 && value < 100) {
            { if (value % 2 == 0)
            	System.out.println("piccolo pari");
            else {
            	System.out.println("piccolo dispari");
            }
            }
        } else {
            System.out.println("grande");
        }
    }
}
