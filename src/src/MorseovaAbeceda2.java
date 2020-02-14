import java.text.Normalizer;
import java.util.Scanner;

public class MorseovaAbeceda2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte zprávu k zakódování: ");
        String zprava = sc.nextLine().toLowerCase();
        String zakodovana = "";

        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

        for (int i = 0; i < zprava.length(); i++) {
            int pozice = abecedniZnaky.indexOf(zprava.charAt(i));
            if (pozice >= 0)
                zakodovana += morseovyZnaky[pozice] + " ";
        }

        System.out.println("Zakódovaná zpráva: " + zakodovana);
    }

}


