import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        //Reverse
        int start= 0;
        int end = size-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }

    }
}
