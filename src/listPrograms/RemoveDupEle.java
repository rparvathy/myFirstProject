package listPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupEle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,22,23,1,2,2,3,3,4,4));
        System.out.println("Original list : " +list);
        List<Integer> newList = list.stream()
                                .distinct()
                                .toList();
        System.out.println("After removing duplicates : " +newList);


    }
}
