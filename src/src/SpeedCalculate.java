public class SpeedCalculate {

    public static void main(String[] args) {

        float distance;
        float time;
        float speed;

        distance = 30f; //km

        time = 1500f / 3600; // h

        speed = distance / time;

        System.out.format("The average speed is %f km/h%n", speed);
    }
}
