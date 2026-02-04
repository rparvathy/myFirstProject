//find the longest word in a sentence
package stringQuestions;

import java.util.Scanner;

public class LongestWordInSent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        String[] arr = name.split(" ");
        String longestWord = " ";
        for(String word: arr){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("Longest word in the given sentence is : " +longestWord);
    }
}
