//Remove a specific element from a List
package listPrograms;

import java.util.LinkedList;


public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        System.out.println(ls);
        ls.remove(Integer.valueOf(30)); //remove 30 from list
        System.out.println(ls);
    }
}
