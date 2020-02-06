public class AutoTester {
    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.zatrub();

        Auto bmw = new Auto();
        bmw.nalakuj("modra");
        mercedes.nalakuj("zelena");
        String vyzor = mercedes.getFarba();
        System.out.println(vyzor);
        String vyzor2 = bmw.getFarba();
        System.out.println(vyzor2);
        bmw.zatrub();
        System.out.println(bmw.getFarba());
    }
}
