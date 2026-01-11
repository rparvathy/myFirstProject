import java.util.Arrays;
import java.util.Scanner;

//Merge two arrays in sorted order
public class MergeTwoArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int[] result){
        int i=0,j=0,k=0;

        // merge while both arrays have elements
        while(i< arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        // copy remaining elements of arr1
        while(i< arr1.length){
            result[k++] = arr1[i++];

        }

        // copy remaining elements of arr1
        while(j< arr2.length){
            result[k++] = arr2[j++];

        }
        System.out.println("Merged sorted array :" +Arrays.toString(result));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array1 : ");
        int size1 = sc.nextInt();
        System.out.print("enter size of array2 : ");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] result = new int[arr1.length + arr2.length];
        System.out.println("Enter First array elements :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Second array elements :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        mergeArrays(arr1,arr2,result);
    }
}
