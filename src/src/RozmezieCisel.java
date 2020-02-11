import java.util.Scanner;

public class RozmezieCisel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte číslo v rozmezí 10-20 alebo 30-40:");
        int a = Integer.parseInt(sc.nextLine());
        if (((a >= 10) && (a <= 20)) || ((a >=30) && (a <= 40)))
        {
            System.out.println("Zadal si správne");
        }
        else
        {
            System.out.println("Zadal si nesprávne");
        }
    }
}

