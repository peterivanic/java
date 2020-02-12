import java.util.Scanner;

public class KvadratickaRovnica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :");

//        System.out.println("Zadejte a:");
        float a = Float.parseFloat(sc.nextLine());
//        System.out.println("Zadejte b:");
        float b = Float.parseFloat(sc.nextLine());
//        System.out.println("Zadejte c:");
        float c = Float.parseFloat(sc.nextLine());
        float d = (b * b) - (4 * a * c);

        if (a == 0) {
            System.out.println("Není kvadratická rovnice");
        } else {
            if (d > 0) {
                float o = (float) Math.sqrt(d);
                float x1 = ((-1 * b) + o) / (2 * a);
                float x2 = ((-1 * b) - o) / (2 * a);
                System.out.println(String.format("Rovnice má 2 reálné kořeny x1 = %f, x2 = %f ", x1, x2));

            } else if (d == 0) {
                double o = Math.sqrt(d);
                double x = ((-1 * b) + o) / (2 * a);
                System.out.println("Rovnice má jeden kořen x = " + x);

            } else {
                System.out.println("Neexistuje řešení v oblasti reálných čísel");
            }
        }
    }
}

