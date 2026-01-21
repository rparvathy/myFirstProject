//check if two strings are anagrams
package stringQuestions;


import java.util.Scanner;

public class CheckAnagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter String2 : ");
        String str2 = sc.nextLine().toLowerCase();

        int[] freq = new int[256];
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        for (char c : str1.toCharArray()) {
            freq[c]++;
        }

        for (char c : str2.toCharArray()) {
            freq[c]--;
        }

        /*for (int i = 0; i < freq.length; i++) {
            int count = freq[i];
            if (count != 0) {
                System.out.println("not anagrams");
                return;
            }
        }
        System.out.println("Given Strings are anagrams");
        */
        for (int count : freq) {
            if (count != 0) {
                System.out.println("Not anagrams");
                return;
            }

        }
        System.out.println("Given strings are anagrams");

    }

}
