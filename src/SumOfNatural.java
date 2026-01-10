//Find the sum of first N natural numbers.
import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int num = sc.nextInt();
        int sum = 0;
        /*for (int i = 1; i <= num; i++) {
            sum += i;

        }*/
        int result = sum(num);
        System.out.println("Sum of " + num + " natural numbers = " + result);
    }
    public static int sum(int num){
        return (num*(num+1))/2;
    }
}
