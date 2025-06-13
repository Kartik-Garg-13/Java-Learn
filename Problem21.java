public class Problem21 {
  static void area(int length, int breadth, double radius){
    System.out.println("Area Of Rectangle Is " + length*breadth);
    System.out.println("Area Of Circle Is " + 3.14*Math.pow(radius, 2));
  }
  public static void main(String[] args) {
      area(10, 20, 5);
  }
}
