import java.util.Scanner;
import java.util.Arrays;
public class Median {
    public static void main(String[] args) {

        int cislo = 0;
        int hodnota ;
        int median;
        int m ;

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej počet čísel:");
        int pocet = Integer.parseInt(sc.nextLine());
        int[] cisla = new int[pocet];
        for (int i = 0; i < pocet; i++) {
            cislo = cislo + 1;
            System.out.printf(String.format("Zadej %d. číslo:", cislo));
            hodnota = Integer.parseInt(sc.nextLine());
            cisla[i] = hodnota;
        }
        int[]zadanie = cisla.clone();
        Arrays.sort(cisla);
        m = cisla.length/2;
        median = cisla[m];

//        System.out.println(median);

        for (int i : zadanie){
            float rozdiel = Float.parseFloat(String.valueOf(i - median));
            System.out.println(String.format("%d se od mediánu odchyluje o %f ",i,rozdiel));
        }
    }
}

