package Auto;

public class Auto {
    private String farba;
    private Engine engine;

    public Auto(Engine engine) {
        this.engine = engine;

    }

    public void zatrub() {
        System.out.println("tuut");
    }

    public String getFarba() {
        return farba;

    }

    public void nalakuj(String farba) {
        this.farba = farba;
        System.out.println("lakujem");

    }
    public float maxSpeed(){
        float speed = engine.getVolume() / 5;
        return speed;
    }

    public String nastartuj(){
        if (engine.getVolume()< 700){
            return "vrum";
        }else {
            return "VRRRRRR";
        }
    }

}
