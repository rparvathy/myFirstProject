import java.util.Scanner;

public class CountEvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evencount =0;
        int oddCount =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evencount++;
            }else
                oddCount++;
        }
        System.out.println("Even count = " +evencount);
        System.out.println("odd count = " +oddCount);

    }
}
