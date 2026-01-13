package stringQuestions;

import java.util.Scanner;

public class StringArrayConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String name = sc.nextLine();

        char[] arr = name.toCharArray();
        System.out.println("String is converted to character array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
