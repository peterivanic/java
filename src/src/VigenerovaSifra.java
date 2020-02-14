import java.util.Scanner;

public class VigenerovaSifra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte text k zašifrování:");
        String text = sc.nextLine().toLowerCase();


        System.out.println("Zadejte heslo:");
        String heslo = sc.nextLine().toLowerCase();

        char[] h = heslo.toCharArray();

        char[] t = text.toCharArray();
        int[] textPole = new int[text.length()];
        char[] sifra = new char[text.length()];
        String sifraFinal = "";

        if (text.length() > heslo.length()) {
            for (int p = 0; p < text.length() - 1; p++) {
                heslo += heslo.charAt(p);
            }
        }
        int[] hesloPole = new int[heslo.length()];

        for (int i = 0; i < heslo.length(); i++) {
            hesloPole[i] = (int) heslo.charAt(i) - 96;
        }

        for (int i = 0; i < text.length(); i++) {
            textPole[i] = (int) text.charAt(i) + hesloPole[i];
        }

        for (int i = 0; i < text.length(); i++) {

            if (textPole[i] > (int) 'z') {
                textPole[i] -= 26;
                sifra[i] = (char) textPole[i];
            } else {
                sifra[i] = (char) textPole[i];
            }

        }

        for (int i = 0; i < text.length(); i++) {
            sifraFinal = sifraFinal + (char) sifra[i];
        }


        System.out.println(sifraFinal);

    }
}
