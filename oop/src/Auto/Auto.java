package Auto;

public class Auto {
    private String farba;

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
}
