public class BreakContinue {

    public static void main(String[] args) {
        
        for (int s = 1; s < 10; s++) {
            if (s == 7) {
                System.out.println("sedem");
                break;
            }
            System.out.println(s);
        }

        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");

        for (int s = 1; s < 10; s++) {
            if (s == 6) {
                System.out.println("sest");
                continue;

            }
            System.out.println(s);
        }
    }
}
