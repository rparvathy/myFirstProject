import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[4];
        for(int i =0;i<4;i++){
            System.out.println("enter num " +(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <4 ; i++) {
            if(i<3) {
                System.out.print(arr[i] + ",");
            }
            else{
                System.out.print(arr[i]);
            }
        }

    }
}
