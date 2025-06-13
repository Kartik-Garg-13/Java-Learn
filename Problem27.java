public class Problem27 {
  private double balance;
  public Problem27(double initialBalance) {
    balance = initialBalance;
  }
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount);
    } else {
      System.out.println("Insufficient balance or invalid amount.");
    }
  }
  public void checkBalance() {
    System.out.println("Current Balance: " + balance);
  }
  public static void main(String[] args) {
    Problem27 myAccount = new Problem27(1000);
    myAccount.checkBalance();
    myAccount.deposit(500);     
    myAccount.withdraw(300);    
    myAccount.withdraw(1500);   
    myAccount.checkBalance();   
  }
}
