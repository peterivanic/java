import java.util.Scanner;

public class RozdielPismen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte delší slovo:");
        String s = sc.nextLine();
        System.out.println("Zadejte kratší slovo:");
        String p = sc.nextLine();

        int i = s.length();
        int j = p.length();
        int v = i - j;

        String h = String.format("Slova se liší délkou o %d znaků.",v);
        System.out.println(h);

    }

}
