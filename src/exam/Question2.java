package exam;
//Write a Java program to read N integers into an array. Count and print the total number of even and
//odd elements. Also calculate and print the sum of even numbers and the sum of odd numbers.
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                //System.out.println("Even numbers : " + arr[i]);
                evenCount++;
                evenSum += arr[i];

            }
            else {

                //System.out.println("Odd numbers : " + arr[i]);
                oddCount++;
                oddSum += arr[i];
            }
        }

        System.out.println("Count of Even numbers : " +evenCount);
        System.out.println("sum of Even numbers : " + evenSum);
        System.out.println("**********************************");
        System.out.println("Count of Odd numbers : " + oddCount);
        System.out.println("sum of odd numbers : " + oddSum);


    }
}
