import java.util.Scanner;

public class Smajlik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej smajlíka:");
        String s = sc.nextLine();

        switch (s){
            case ":-)":
            case ":)":
                System.out.println("Tvůj smajlík je veselý");
                break;
            case ":-(":
            case ":(":
                System.out.println("Tvůj smajlík je smutný");
                break;
            case ":-*":
            case ":*":
                System.out.println("Tvůj smajlík je zamilovaný");
                break;
            case ":-P":
            case ":P":
                System.out.println("Tvůj smajlík je s vyplazeným jazykem");
                break;
            default:
                System.out.println("Tvůj smajlík je neznámý");
        }
    }
}
