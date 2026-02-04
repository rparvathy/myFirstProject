package listPrograms;

import java.util.ArrayList;

public class SecondLargestEle {
    public static Integer secondLargest(ArrayList<Integer>numbers){
        if (numbers == null || numbers.size() < 2) {
            return null;
        }

        Integer largest = null;
        Integer secondLarge = null;
        for (int i = 0; i < numbers.size(); i++) {
            Integer n= numbers.get(i);
            if(n==null)continue;
            if(largest==null||n > largest){
                secondLarge= largest;
                largest =n;
            }else{
                if(!n.equals(largest) && (secondLarge==null || n>secondLarge)){
                    secondLarge=n;
                }
            }
        }
        return secondLarge;

    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(40); // duplicate
        numbers.add(null);

        System.out.println("Original list : "+numbers);
        System.out.println("Second Largest element : "+secondLargest(numbers));
    }
}
