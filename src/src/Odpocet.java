public class Odpocet {

    public static void main(String[] args) {
        int cislo = 20;
        int[] pole = new int[cislo];

        for (int i = 0; i <pole.length; i++) {
            pole[i] = cislo;
            cislo = cislo - 1;
        }
        for (int i : pole){
            System.out.println(i);
        }
    }
}
