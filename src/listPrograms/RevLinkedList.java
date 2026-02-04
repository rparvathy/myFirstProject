//reverse a linkedlist without using extra space
package listPrograms;

import java.util.LinkedList;

public class RevLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(7);
        System.out.println("before reversing : " +ls);
        int left =0;
        int right = ls.size()-1;

        while(left<right){
            Integer temp = ls.get(left);
            ls.set(left,ls.get(right));
            ls.set(right,temp);
            left++;
            right--;

        }
        System.out.println("After reversing: "+ls);
    }
}
