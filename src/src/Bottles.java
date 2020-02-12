import javax.swing.*;

public class Bottles {
    public static void main(String[] args) {
        int pocet ;
        for (int i = 10; i != 0; i--) {
            if (i >= 5) {
                pocet = i;
                System.out.println(String.format("%d zelených láhví stojí na stole a jedna láhev spadne", pocet));
            } else if (i >= 2) {
                pocet = i;
                System.out.println(String.format("%d zelené láhve stojí na stole a jedna láhev spadne", pocet));

            } else if (i == 1) {
                pocet = i;
                System.out.println(String.format("%d zelená láhev stojí na stole a jedna láhev spadne", pocet));
            }
        }
    }
}

