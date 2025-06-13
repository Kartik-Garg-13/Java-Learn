import java.util.Scanner;
public class ReverseString {
    static String reversal(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write Your String:");
        String a = myObj.nextLine();
        String b = a.toLowerCase();
        System.out.println(reversal(b));
        myObj.close();
    }
}
