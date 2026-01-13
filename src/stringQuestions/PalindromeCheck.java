package stringQuestions;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        String rev = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev + name.charAt(i);
        }

        if(rev.equals(name)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a palindrome string");
        }

    }
}
