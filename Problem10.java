public class Problem10 {
  public static void main(String[] args) {
    int day = 3;
    if (day>0 && day<8){
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
    }
    else{
      System.out.println("Not A Valid Day Number");
    }
  }
}