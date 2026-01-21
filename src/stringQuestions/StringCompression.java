//String compression (e.g., aaabb → a3b2)

package stringQuestions;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        //for appending the last char
        result.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(result);


    }
}
