package Geometry;

public class GeometryTester {
    public static void main(String[] args) {

        Circle circle = new Circle(12,"red");
        Rectangle rectangle = new Rectangle(2,3);

        System.out.println(circle.getArea());

        circle.enlarge(3);

        System.out.println(circle.getArea());

        circle.enlarge();

        System.out.println(circle.getArea());
        System.out.println(circle);
        System.out.println(rectangle.getArea());

        System.out.println(rectangle.toString());

    }
}
