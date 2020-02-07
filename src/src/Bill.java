import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        System.out.println("Napis meno : ");
        Scanner scanner = new Scanner(System.in);
        String meno = scanner.nextLine();

        System.out.println("Napis vlastnost : ");
        Scanner scanner1 = new Scanner(System.in);
        String vlastnost = scanner1.nextLine();

        System.out.println(meno + " je " + vlastnost );
    }

}
