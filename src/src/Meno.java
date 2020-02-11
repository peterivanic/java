import java.util.Scanner;

public class Meno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej své jméno:");
        int s = Integer.parseInt(String.valueOf(scanner.nextLine().length()));
        if( (s > 3) && (s<10) ){
            System.out.println("Normální jméno.");
        }
        else {
            System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
        }
    }
}
