import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte levou mez 1. intervalu:");
        int l1 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 1. intervalu:");
        int p1 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte levou mez 2. intervalu:");
        int l2 = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte pravou mez 2. intervalu:");
        int p2 = Integer.parseInt(sc.nextLine());
        System.out.println("Dvojice čísel, jejichž součet leží v některém z intervalů:");
        System.out.println("(1. číslo je z prvního intervalu a 2. z druhého intervalu)");
        for (int j = l1 ; j <= p1 ; j++) {
            for (int i = l2 ; i <= p2 ; i++) {
                if ((( i + j ) >= l1 && ( i + j ) <= p1 ) || (( i + j ) >= l2 && ( i + j ) <= p2))
                    System.out.printf("[%d;%d], ",j,i);
            }
        }
    }
}
