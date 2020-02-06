public class Outer {
    public static void main(String[] args) {

        int d;
        outer:
        for (int s = 1; s < 4; s++){
            for (d = 1; d < 6; d++){
                if (d == 5){
                    System.out.println("stop");
                   continue outer;
                }
                System.out.println(s+" "+d);
            }
        }
    }
}
