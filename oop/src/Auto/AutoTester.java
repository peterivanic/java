package Auto;

public class AutoTester {
    public static void main(String[] args) {
        Engine mercedesEngine = new Engine(500);
        Engine bmwEngine = new Engine(1000);


        Auto mercedes = new Auto(mercedesEngine);
        mercedes.zatrub();

        Auto bmw = new Auto(bmwEngine);
        bmw.nalakuj("modra");
        mercedes.nalakuj("zelena");
        String vyzor = mercedes.getFarba();
        System.out.println(vyzor);
        String vyzor2 = bmw.getFarba();
        System.out.println(vyzor2);
        bmw.zatrub();
        System.out.println(bmw.getFarba());
        System.out.println(bmw.maxSpeed());
        System.out.println(mercedes.maxSpeed());
        System.out.println(bmw.nastartuj());
        System.out.println(mercedes.nastartuj());
    }
}
