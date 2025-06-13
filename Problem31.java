abstract class Shape{
  public abstract void area();  
}
class Circle extends Shape{
  int radius;
  public Circle(int radius){
    this.radius=radius;
  }
  public void area(){
    double circleArea=3.14*radius*radius;
    System.out.println(circleArea);
  }
}
class Rectangle extends Shape{
  int length;
  int breadth;
  public Rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
  }
  public void area(){
    int rectangleArea=length*breadth;
    System.out.println(rectangleArea);
  }
}

public class Problem31{
  public static void main(String[] args) {
      Circle mycircle = new Circle(5);
      Rectangle myrectangle = new Rectangle(12, 10);
      mycircle.area();
      myrectangle.area();
  }
}