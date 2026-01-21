//Remove duplicate characters
package stringQuestions;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine().toLowerCase();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(char c : name.toCharArray()){
            hs.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c: hs){
            result.append(c);
        }
        System.out.println(result.toString());
    }
}
