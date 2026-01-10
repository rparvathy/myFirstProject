import java.util.Scanner;

//Print numbers from 1 to N using a for loop.
public class NumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
