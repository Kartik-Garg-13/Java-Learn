import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Task task;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select Option 1 or 2");
        int option=scanner.nextInt();
        if(option==1){
            task=new test();
            task.performTask();
        } else if (option==2) {
            task=new Initiate();
            task.performTask();
        }
        else{
            System.out.println("Option Is Not Valid");
        }
    }
}
