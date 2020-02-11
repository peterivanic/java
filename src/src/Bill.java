import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jak se jmenuješ?");
        String jmeno = sc.nextLine();
        System.out.println("Jaký jsi?");
        String vlastnost = sc.nextLine();
        System.out.println(jmeno + " je " + vlastnost);
    }
}
