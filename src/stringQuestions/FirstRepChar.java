//Find first repeating character
package stringQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepChar {
    public static void getRepChar(String name){
        HashMap<Character,Integer> hm =new HashMap<>();
        char[] arr = name.toCharArray();

        for (char c: arr) {
            if (!Character.isWhitespace(c)) {
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                } else {
                    hm.put(c, 1);
                }
            }
        }

        for(char c : arr ){
            if(!Character.isWhitespace(c) && hm.get(c)>1){
                System.out.println("First repeating char found : "+c + ": "+ hm.get(c));
                return;
            }
        }
        System.out.println("Nothing is repeating");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine().toLowerCase();
        getRepChar(name);
    }
}
