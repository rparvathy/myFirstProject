package listPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNull {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,22,23,null,2,2,3,null,4,4));
        System.out.println("Original list : " +list);
        List<Integer> newList = list.stream()
                .filter(Objects::nonNull)
                .toList();
        System.out.println("After removing null "+newList);
    }
}
