import java.util.ArrayList;
import java.util.List;

class GetPI {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();
        float k;
        float m;
        float p;
        float h;
        float f = 0;

        for (k = 1; k < 200000; k++) {
            if (k % 2 == 1) {
                m = 1 / k;
                list.add(m);
            }
        }
        for (int s = 0; s < list.size(); s++) {
            if (s % 2 == 1) {
                h = -1 * list.get(s);
                f = f + h;
            } else {
                p = list.get(s);
                f = f + p;
            }
        }
        float pi = 4 * f;
        System.out.println("PI is : " + pi);
    }
}
