import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("enter the number to be searched : ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Number is found at index : " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Number is not found in the array.");
        }

    }
}
