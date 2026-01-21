//Count frequency of each character
package stringQuestions;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        System.out.print("Enter the letter to check frequency : ");
        char c = sc.next().charAt(0);
        int count =0;
        char lowerC= Character.toLowerCase(c);
        for (int i = 0; i < name.length(); i++) {
            if(Character.toLowerCase(name.charAt(i))== lowerC){
                count++;
            }
        }
        System.out.println("Frequency of character " +c+ " : " +count);

    }
}
