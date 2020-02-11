public class Krokonosohroch {

    public static void main(String[] args) {
        String s = "Krokonosohroch";
        System.out.println(s.startsWith("krok"));
        System.out.println(s.endsWith("hroch"));
        System.out.println(s.contains("nos"));
        System.out.println(s.contains("roh"));
        s = s.replace("hroch","slon");
        System.out.println(s);

    }
}

