import java.util.Scanner;

public class MultiplyWithoutOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        System.out.println("Multiplication result : " +result);
    }
}
