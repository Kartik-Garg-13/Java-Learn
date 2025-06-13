public class Problem20 {
  static void checkPrime(int num){
    boolean checker=false;
    for (int i=2;i<=num/2;i++){
      if (num%i==0){
        checker=true;
      }
    }
    if(checker==true){
        System.out.println("Number Is Not Prime " + num);
    }
    else{
        System.out.println("Number Is Prime " + num);
    }
  }
  public static void main(String[] args) {
      checkPrime(26);
  }
}
