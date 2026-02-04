package listPrograms;


import java.util.ArrayList;

public class MaxMinList {

    public static Integer findMax(ArrayList<Integer> ls) {
        if (ls==null||ls.isEmpty()){
            return null;
        }
        Integer max = null;
        for (int i = 0; i <ls.size() ; i++) {
            Integer n =ls.get(i);
            if(n==null)continue;
            if(max==null || n >max){
                max =n;
            }
        }
        return max;
    }

    public static Integer findMin(ArrayList<Integer> ls) {
        if (ls == null || ls.isEmpty()) {
            return null;
        }

        Integer min = null;

        for (int i = 0; i < ls.size(); i++) {
            Integer n = ls.get(i);

            if (n == null) continue;

            if (min == null || n < min) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(400);
        ls.add(8);
        ls.add(0);

        System.out.println("Original list: " + ls);
        System.out.println("Max value: " + findMax(ls));
        System.out.println("Min value: " + findMin(ls));
    }
}
