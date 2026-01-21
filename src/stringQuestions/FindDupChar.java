//find the duplicate char
package stringQuestions;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDupChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate Characters are : ");

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
