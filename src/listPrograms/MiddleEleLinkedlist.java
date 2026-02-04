//Find the middle element of a LinkedList.
package listPrograms;

import java.util.LinkedList;

public class MiddleEleLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(2);
        ls.add(5);
        ls.add(8);
        ls.add(7);

        int middleEle = ls.size() / 2;
        System.out.println("Middle element : "+ ls.get(middleEle));
        //if the list is even there will be 2 middle elements
       /* int mid1 = ls.size()/2;
        int mid2 =(ls.size()/2) -1;
        System.out.println("Middle elements : "+ls.get(mid1)+ " & " +ls.get(mid2));*/
    }


}
