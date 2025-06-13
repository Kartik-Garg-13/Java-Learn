public class Problem7 {
  public static void main(String[] args) {
    String name="Kartik Singh";
    String check="Singh";
    int x;
    System.out.println(name.toUpperCase());
    System.out.println(name.length());
    x = name.indexOf(check);
    if (x==-1){
      System.out.println("Does not exist in the name");
    }
    else {
      System.out.println("Exists At Index " + x);
    }
  }
}
