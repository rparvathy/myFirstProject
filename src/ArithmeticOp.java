import java.util.Scanner;

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        int totalSum = sum(num1, num2);
        System.out.println("Sum = " + totalSum);

        int difference = diff(num1, num2);
        System.out.println("Difference = " + difference);

        int product = prod(num1, num2);
        System.out.println("Product = " + product);

        int quotient = div(num1, num2);
        System.out.println("quotient = " + quotient);


    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int diff(int num1, int num2) {
        return num1 - num2;
    }

    public static int prod(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num2 / num1;
    }

}
