/*Write a Java program that takes a string as input, reverses the string, and checks whether it is a
        palindrome. Print whether the string is a palindrome or not.*/
package exam;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int dig = 0;
        int rev = 0;
        while (num != 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.print("Palindrome number");
        } else {
            System.out.print("Not a Palindrome number");
        }

    }
}
