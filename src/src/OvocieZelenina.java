import java.util.Scanner;
import java.util.Arrays;

public class OvocieZelenina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        Arrays.sort(ovoce);
        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        Arrays.sort(zelenina);

        int Cyklus = 0;
        String potvrzeni = "ano";
        while ("ano".equals(potvrzeni)) {
            Cyklus++;
            System.out.println("Zadej název libovolného ovoce nebo zeleniny:");
            String slovo = sc.nextLine().trim().toLowerCase();

            Arrays.sort(zelenina);
            Arrays.sort(ovoce);
            int poziceOvoce = Arrays.binarySearch(ovoce, slovo);
            int poziceZeleniny = Arrays.binarySearch(zelenina, slovo);

            if (poziceOvoce >= 0) {
                System.out.println("Zadal jsi ovoce");
            } else if (poziceZeleniny >= 0) {
                System.out.println("Zadal jsi zeleninu");
            } else {
                System.out.println("Tvoje slovo nemám v seznamu");
            }
            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            potvrzeni = sc.nextLine().trim().toLowerCase();

        }
        System.out.println("Zadal jsi " + (Cyklus) + " slov");

    }
}
