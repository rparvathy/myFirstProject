//Update an element at a given index
package listPrograms;

import java.util.LinkedList;

public class UpdateEle {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Red");
        ls.add("Orange");
        ls.add("Mango");
        System.out.println("Before update : " +ls);
        updateEle(ls,2,"Mulberry");
        System.out.println("After update : " +ls);

    }
    public static void updateEle(LinkedList<String> ls,int index, String newValue){
        ls.set(index,newValue);
    }

}
