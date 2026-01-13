package stringQuestions;

import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        int count = 0;

        for(char c : name.toCharArray()){
            count++;
        }
        System.out.print("Length of string : " +count);
        }

    }

