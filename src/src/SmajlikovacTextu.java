import java.util.Scanner;

public class SmajlikovacTextu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej text k rozveselení:");
        String vstup = sc.nextLine();
        String[] smajlici = {"b:)", " :D", " :P"};
        String[] vstup1 = vstup.split("");
        String text = "";
        int x = 0;
        for (String znak : vstup1) {
            text += znak;
            if (znak.equals(".")) {
                text = text.replace(".", smajlici[x]);
                x += 1;
            } else if (znak.equals("?") || znak.equals("!")) {
                text += smajlici[x] ;
                x += 1;
            }
            if (x > 2) {
                x = 0;
            }
        }

        System.out.print("Rozveselený text: "+text);
    }
}