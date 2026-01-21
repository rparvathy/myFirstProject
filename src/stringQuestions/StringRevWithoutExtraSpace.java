//Reverse string without using extra space
package stringQuestions;

import java.util.Scanner;

public class StringRevWithoutExtraSpace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        System.out.println("Reversed string : " + String.valueOf(arr));

    }

}
