//Write a Java program that accepts an integer number as input and uses a method isPrime(int n) to
//check whether the number is prime. Print an appropriate message based on the result.

package exam;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);

    }

    public static void isPrime(int n) {
        boolean primeChcek = true;

        if (n <= 1) {
            primeChcek = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % 2 == 0) {
                    primeChcek = false;
                    break;
                }
            }
            if (primeChcek) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a Prime number");
            }
        }
    }
}
