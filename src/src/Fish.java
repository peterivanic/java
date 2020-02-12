import java.util.Scanner;

public class Fish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        System.out.println("How many fish you wish:");
        int f = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= f; i++){
            System.out.println("<° )))-<");
        }
    }
}
