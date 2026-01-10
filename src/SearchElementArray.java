import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int key =sc.nextInt();

        int index = -1; // assume not found
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i; // found
                break;     // stop loop
            }
        }

        if (index != -1) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
