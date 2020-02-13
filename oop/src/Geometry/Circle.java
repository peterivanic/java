package Geometry;

public class Circle {
  private float radius;
  private String color ;


  public Circle(float radius,String color){
      this.radius = radius;
      this.color = color;
  }

    public float getRadius() {
        return radius;
    }

    public String getColor() {
      return color;
    }

    public float getArea() {

     float area = radius * radius *(float) Math.PI;

     return area;
    }

    public void enlarge(float amount){

      radius = radius + amount;

  }
  public void enlarge(){
      this.enlarge(1);
  }

    @Override
    public String toString() {
        return String.format("Circle{radius :%.3f, color:%s}",radius,color);
    }
}
