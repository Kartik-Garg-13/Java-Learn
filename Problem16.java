public class Problem16 {
  public static void main(String[] args) {
      int[] num={2,5,3,8,7,1};
      int large=num[0];
      for (int i:num){
        if (i>large){
          large=i;
        }
      }
      System.out.println("Largest Number Is " + large);
      int small=num[0];
      for (int i:num){
        if (i<small){
          small=i;
        }
      }
      System.out.println("Smallest Number Is " + small);
  }
}
