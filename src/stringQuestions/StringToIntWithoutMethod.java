//Convert String to Integer without using parseInt()
package stringQuestions;

import java.util.Scanner;

public class StringToIntWithoutMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String str = sc.nextLine();
       /* int num = Integer.parseInt(str);
        System.out.println(num);*/  //using the method

        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //validate character
            if (ch < 0 || ch > 9) {
                throw new NumberFormatException("Invalid String ");
            }
            num = num * 10 + (ch - '0');
        }
        System.out.println(num);

    }
}
