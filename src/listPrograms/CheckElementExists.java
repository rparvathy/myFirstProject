//Check if a given element exists in a List
package listPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckElementExists {
    public static void checkElementexists(String ele, int n, Scanner sc) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            list.add(sc.nextLine());
        }
        if (list.contains(ele)) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Give the element to check  : ");
        String ele = sc.nextLine();
        checkElementexists(ele, n, sc);

    }
}
