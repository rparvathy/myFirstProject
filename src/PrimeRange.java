

public class PrimeRange {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {   // numbers to test
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {     // check for extra factors
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        }

    }

