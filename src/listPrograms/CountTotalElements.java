//Count total number of elements in a List
package listPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CountTotalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you have to store in list ? ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("enter element " + (i + 1) + " : ");
            names.add(sc.nextLine());
        }
        System.out.println(names);
        System.out.println("Total number of elements in list : " + names.size());
    }
}
