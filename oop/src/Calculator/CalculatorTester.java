package Calculator;

import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write first number : ");
        int number1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Write second number : ");
        int number2 = sc.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("sum is : " + calculator.sum(number1,number2));
        System.out.println("deduction is : " + calculator.deduction(number1,number2));
        System.out.println("divide is : " + calculator.divide(number1,number2));
        System.out.println("multiple is : " + calculator.multiple(number1,number2));
        System.out.println("sum of all result is : " + calculator.result);

    }
}
