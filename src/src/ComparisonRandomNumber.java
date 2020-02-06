import java.util.Random;
import java.util.Scanner;

public class ComparisonRandomNumber {

    public static void main(String[] args) {

        System.out.print("Write number:");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Your number is : " + number);

        Random r = new Random();
        int randomNumber = r.nextInt(9);

        System.out.println("Random number is : " + randomNumber);

        if (number > 0) {

            System.out.println("Your number is positive");


        } else if (number == 0) {

            System.out.println("Your number is zero");
        } else {
            System.out.println("Your number is negative");
        }

        if ( number < randomNumber){
            System.out.println("Your number is smaller");
        }
        else if (number > randomNumber){
            System.out.println("Your number is biger");
        }


        for (int i = -1; i >= number; i--) {
            System.out.println(i);

        }
        for (int i = 1; i <= number; i++) {

                System.out.println(i);

        }


        if (number % 2 == 0) {

            System.out.println("Number is divisible");

        } else {
            System.out.println("Number is not divisible");


        }
    }
}
