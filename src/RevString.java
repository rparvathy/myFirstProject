//to reverse a string
import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String name = sc.nextLine();
        String rev = "";

        for (int i = name.length() -1;  i >=0 ; i--) {
            rev = rev + name.charAt(i);
        }
        //System.out.println("reverse : " +rev);
        if(rev.equals(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
