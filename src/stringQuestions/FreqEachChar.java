//Count frequency of each character
package stringQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class FreqEachChar {
    public static void  getCount(String name){
        HashMap<Character, Integer> hm= new HashMap<>();
        char[] charArray = name.toCharArray();

            for (char c : charArray) {
                if (!Character.isWhitespace(c)) {
                    if (hm.containsKey(c)) {
                        hm.put(c, hm.get(c) + 1);
                    } else {
                        hm.put(c, 1);
                    }
                }
            }

        System.out.println(name + " : " + hm);

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        getCount(name);

    }
}
