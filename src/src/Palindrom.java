import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadaj palindrom:");
        String palindrom = sc.nextLine();

        char[] palindromPole = palindrom.toCharArray();

        String palindromZozadu = "";

        for (int i = palindromPole.length - 1; i > -1; i--) {
            palindromZozadu += palindromPole[i];
        }
        if (palindromZozadu.equals(palindrom)) {
            System.out.println("Toto je palindrom.");
        } else {
            System.out.println("Toto neni palindrom.");
        }
    }
}