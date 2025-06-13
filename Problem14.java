public class Problem14 {
  public static void main(String[] args) {
    int num=1;  
    while (true) {
      if (num%3 != 0){
        System.out.println(num);
        num++;
      }
      else{
        num++;
        continue;
      }
      if (num == 50){
        break;
      }
    }
  }
}
