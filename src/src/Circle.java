import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        System.out.print("Write radius : ");

        Scanner sc = new Scanner(System.in);
        double radius = Double.parseDouble (sc.nextLine());

       double circumference =  Math.PI * (radius*2);
       double content = radius * radius * Math.PI;

        System.out.println("Circumference this circle is : " + circumference + " cm");
        System.out.println("Circle content this circle is : " + content + " cm2");
    }
}
