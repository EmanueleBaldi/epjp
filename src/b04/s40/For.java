package b04.s40;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Begin block loop " + i);

            if (i == 2) {
                continue;
            }

            System.out.println("End block loop " + i);
        }
    }
}
