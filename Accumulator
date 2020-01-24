import java.util.Scanner;

public class Accumulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write number:");
        int number = sc.nextInt();

        int sum = 0;
        for (int s = 0; s < number; s++) {   //all to the number
            sum = sum + s;
        }
        System.out.println(sum);

        int product = 1;
        for (int s = 1; s < number; s++) {
            product = product * s;
        }
        System.out.println(product);

        int result = 1;
        for (int t = 0; t < number; t++) {
            if (t % 6 == 0) {
                result = result + t * t;
            } else if (t % 2 == 0) {

                result = t + result;
            } else if (t % 3 == 0) {
                result = result * t;
            }

        }
        System.out.println(result);

    }
}
