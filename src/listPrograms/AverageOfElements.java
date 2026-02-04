//Find the average of numeric elements in a List
package listPrograms;

import java.util.ArrayList;

public class AverageOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(29);
        nums.add(31);
        nums.add(null);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            Integer val = nums.get(i);
            if (val != null) {
                sum += val;
            }
        }
        double avg = (double) sum / nums.size();
        System.out.println("Average is : " + avg);
    }
}
