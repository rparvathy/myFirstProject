package stringQuestions;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
       // System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    }
}
