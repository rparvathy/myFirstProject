//remove ages less than 20 from list
package listPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveElementsIterator {
    public static void main(String[] args) {
        LinkedList<Integer> ages= new LinkedList<>();
        ages.add(12);
        ages.add(15);
        ages.add(17);
        ages.add(30);
        ages.add(40);
        ages.add(50);
        System.out.print("Original list : "+ages);
        System.out.print("\nAfter removing age less than 20 : ");
        /*Iterator<Integer> itr = ages.iterator();
        while(itr.hasNext()){
            int age = itr.next();
            if (age<20){
                itr.remove();
            }
        }*/
        ages.removeIf(age->age<20);
        System.out.println(ages);
    }
}
