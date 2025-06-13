public class Problem26 {
  double radius;
  public Problem26(double r){
    radius=r;
  }
  public double Area(){
    return Math.PI*radius*radius;
  }
  public double Circumference(){
    return 2*Math.PI*radius;
  }
  public static void main(String[] args) {
    Problem26 circle = new Problem26(10.0);
    System.out.println("Radius: " + circle.radius);
    System.out.println("Area: " + circle.Area());
    System.out.println("Radius: " + circle.Circumference());
  }
}
