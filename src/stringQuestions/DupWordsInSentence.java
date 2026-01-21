//find  dup words in a sentence
package stringQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DupWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String str = sc.nextLine().toLowerCase();
        String[] arr = str.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s : arr){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        System.out.println("Duplicate words are : ");
       for (Map.Entry<String, Integer> entry :hm.entrySet()){
           if(entry.getValue()>1){
               System.out.println(entry.getKey());
           }
       }
    }
}
