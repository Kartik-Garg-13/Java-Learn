public class checkprime {
    static void checkPrime(int a) {
        if (a <= 1) {
            System.out.println("Number is not prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
    public static void main(String[] args) {
        checkPrime(3);  // Test with different numbers here
    }
}
