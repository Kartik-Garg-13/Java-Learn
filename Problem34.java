import java.util.Scanner;
public class Problem34 {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write Your Name");
        String name = myObj.nextLine();
        System.out.println("Write Your Marks");
        int marks = myObj.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("Grade Of " + name + " Is A+");
        } else if (marks >= 80 && marks < 90 ) {
            System.out.println("Grade Of " + name + " Is A");
        } else if (marks >= 70 && marks < 80 ) {
            System.out.println("Grade Of " + name + " Is B+");
        } else if (marks >= 60 && marks < 70 ) {
            System.out.println("Grade Of " + name + " Is B");
        } else if (marks >= 50 && marks <60 ){
            System.out.println("Grade Of " + name + " Is C+");
        } else if (marks >= 40 && marks < 50 ) {
            System.out.println("Grade Of " + name + " Is C");
        } else if (marks >= 30 && marks < 40 ) {
            System.out.println("Grade Of " + name + " Is D");
        } else if (marks >= 20 && marks < 30 ) {
            System.out.println("Grade Of " + name + " Is E");
        } else if (marks < 20 ) {
            System.out.println("Grade Of " + name + " Is F");
        }else{
            System.out.println("Enter Valid Marks");
        }
    }
}
