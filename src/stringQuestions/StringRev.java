package stringQuestions;

import java.util.Scanner;
import java.lang.String;



public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        String rev = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.print("Reversed String : " +rev);


    }
}
