//Find first non-repeating character
package stringQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepChar {
    public static void getNonRepChar(String name){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = name.toCharArray();
       for (char c : arr){
           if (map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else{
               map.put(c,1);
           }
       }
       for(char c: arr){
           if (map.get(c)==1){
               System.out.println("the first non repetitive character is : " +c);
               return; //or break;
           }
       }
        System.out.println("no non repeating character in the string");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);System.out.print("Enter the string to check : ");
        String name = sc.nextLine().toLowerCase();
        getNonRepChar(name);

    }

}
