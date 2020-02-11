public class Format {
    public static void main(String[] args) {
//
//                %d pro celá čísla
//                %s pro String
//                %f pro float.

        int a = 10;
        int b = 20;
        int c = a + b;

        String s = String.format("Ked spocitame %d a %d, dostaneme : %d", a, b, c);

        System.out.println(s);

    }
}

