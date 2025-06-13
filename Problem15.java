public class Problem15 {
  public static void main(String[] args) {
      int[] num={1,4,6,3,9};
      int sum=0;
      System.out.println(num);
      for (int i : num){
        sum=sum+i;
      }
      System.out.println(sum);
      System.out.println(sum/num.length);
  }
}
