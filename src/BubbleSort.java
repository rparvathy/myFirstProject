import java.util.Scanner;

//sort the elements in the array in asc order
public class BubbleSort {
    public static void bubbSort(int arr[]){
        int temp;
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;  //assume that we have a sorted array
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void printArray(int arr[]){
        System.out.println("Sorted array : ");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]  +"\t");
        }
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
        bubbSort(arr);
        printArray(arr);
    }
}
