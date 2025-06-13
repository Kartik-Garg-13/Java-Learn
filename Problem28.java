public class Problem28 {
  String name;
  int id;
  static int count;
  public Problem28(String name, int id){
    this.name=name;
    this.id=id;
    count++;
  }
  public static void main(String[] args) {
    Problem28 emp1 = new Problem28("Kartik",18);
    Problem28 emp2 = new Problem28("Arunika",04);
    Problem28 emp3 = new Problem28("Arnav",67);
    System.out.println(emp1.name + ' ' + emp1.id);
    System.out.println(emp2.name + ' ' + emp2.id);
    System.out.println(emp3.name + ' ' + emp3.id);
    System.out.println(count);
  }
}
