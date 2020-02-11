import java.util.Scanner;

public class SlovoHladac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej řetězec:");
        String s = sc.nextLine().toLowerCase();


        boolean v = (s.contains("itnetwork"));
        System.out.println(v);

    }
}
