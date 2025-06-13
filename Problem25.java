public class Problem25{
  String name;
  int rollNo;
  int marks;
  public Problem25(String name, int rollNo, int marks){
    this.name="Kartik";
    this.rollNo=18;
    this.marks=100;
  }
  public static void main(String[] args) {
    Problem25 mymarks= new Problem25("Kartik",18,100);
    System.out.println(mymarks.name);
    System.out.println(mymarks.rollNo);
    System.out.println(mymarks.marks);
  }
}