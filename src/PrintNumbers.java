public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i > 1) {
                // Print the number and a comma for everything above 1
                System.out.print(i + ",");
            } else {
                // Print the final number without a comma
                System.out.print(i);

            }
        }
    }
}