package Kalkulacka;

public class Kalkulacka {


    public int spocitaj(int n, int m) {

        return n + m;
    }

    public int vynasob(int n, int m) {
        int sucin = 0;
        for (int v = 0; v < n; v++) {
            sucin = this.spocitaj(sucin, m);
        }
        return sucin;
    }

    public int odcitaj(int n, int m) {

        return n - m;
    }

    public int vydel(int n, int m) {

        return n / m;
    }

}
