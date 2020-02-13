import java.util.Scanner;

public class VigenerovaSifra {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte text k zašifrování:");
        String text = "moribundus";


        System.out.println("Zadejte heslo:");
        String heslo = sc1.nextLine().toLowerCase();

        char[] h = heslo.toCharArray();
        int [] hesloPole = new int[heslo.length()] ;
        char[] t = text.toCharArray();
        int [] textPole = new int[text.length()];
        char[] sifra = new char[text.length()];
        String sifraFinal = "";



        for (int i = 0; i < heslo.length();i++ ){
            hesloPole [i] = (int) heslo.charAt(i)-96;
        }
        for (int i = 0; i <text.length(); i++){

            textPole[i] = (int) text.charAt(i)+hesloPole[i];
        }
       for (int i = 0; i< text.length() ;i++){
           sifra[i] = (char) textPole[i];
       }
       for (int i : sifra){
           System.out.println((char)i);
       }

       for (int i = 0;i < text.length();i++){
           sifraFinal = sifraFinal + (char)sifra[i];
       }


        System.out.println(sifraFinal);
    }
}
