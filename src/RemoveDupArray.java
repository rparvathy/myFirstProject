//remove duplicates from an array
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDupArray {

    public static void remove(int arr[]){
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length ; i++) {
            s.add(arr[i]);

        }
        System.out.println("After removing duplicates : " +s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        remove(arr);
    }
}
