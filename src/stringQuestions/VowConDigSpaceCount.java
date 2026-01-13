// Program to count vowels, consonants, digits, and spaces
package stringQuestions;

import java.util.Scanner;

public class VowConDigSpaceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        int vowCount = 0;
        int consCount = 0;
        int digit = 0;
        int space = 0;


        for (int i = 0; i < name.length(); i++) {
            int ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consCount++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            } else if (ch == ' ') {
                space++;
            }

        }
        System.out.println("Count of vowels : " + vowCount);
        System.out.println("Count of Consonants : " + consCount);
        System.out.println("Count of digits : " + digit);
        System.out.println("Count of Spaces : " + space);
    }
}

