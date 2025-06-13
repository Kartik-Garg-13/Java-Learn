import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write Your First Number");
        int a = myObj.nextInt();
        System.out.println("Write Your Second Number");
        int b = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Choose Your Operator (+,-,*,/)");
        String operator = myObj.nextLine();
        switch(operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                if(a>b){
                    System.out.println(a-b);
                }else{
                    System.out.println(b-a);
                }
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }
    }
}
