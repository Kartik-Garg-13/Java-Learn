public class Problem24 {
  static int fib(int n){
    if (n==0){return 0;}
    if (n==1){return 1;}
    return fib(n-1)+fib(n-2);
  }
  public static void main(String[] args) {
      System.err.print(fib(10));
  }
}
