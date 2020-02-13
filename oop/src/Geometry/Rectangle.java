package Geometry;

public class Rectangle {
     private float length;

     private float width;

     public Rectangle(){
          this(1,1);

     }

     public Rectangle(float length,float width){
          this.length = length;
          this.width = width;
     }

     public float getArea(){
          float area = length * width;
          return area;
     }
     public float getLength(){
          return length;
     }
     public void setLength(float length){
          this.length = length;
     }

     public float getWidth() {
          return width;
     }

     public void setWidth(float width) {
          this.width = width;
     }

     private float getPerimeter(){
          float perimeter = (width + length)*2 ;
          return perimeter;
     }
     public String toString(){
          return String.format("Rectangle [length=%.3f ,  width=%.3f] ",length,width);

     }

}
