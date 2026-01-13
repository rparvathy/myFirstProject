//Count number of vowels and consonants

package stringQuestions;

import java.util.Scanner;

public class VowConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        int vowCount=0;
        int consCount=0;

        for (int i = 0; i < name.length(); i++) {
            int ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {       //ensures only alphabets are counted and ignores spaces or special characters.
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowCount++;
                } else {
                    consCount++;
                }
            }
        }
        System.out.println("Count of vowels : " +vowCount);
        System.out.println("Count of Consonants : " +consCount);
    }
}
