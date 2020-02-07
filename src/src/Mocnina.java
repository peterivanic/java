import java.util.Scanner;

public class Mocnina {

    public static void main(String[] args) {
        System.out.println("Napis cislo : ");
        Scanner scanner = new Scanner(System.in);
        int cislo =  scanner.nextInt();

        int vysledok = cislo * cislo;
        System.out.println(vysledok);
    }
}
