package stringQuestions;

import java.util.Scanner;

public class StringSplitMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();
        String[] arr = name.split(" ");
        for(String c : arr){
            System.out.println(c);
        }
    }
}
