package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Count_Max_Min {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,4,3,6,2,5,9,7,8);
        System.out.println(list);
        //Count number
        Long countNum=list.stream().count();
        System.out.println(countNum);
        //Count Even
        Long countEven=list.stream().filter(x->x%2==0).count();
        System.out.println(countEven);
        //Count Odd
        Long countOdd=list.stream().filter(x->x%2!=0).count();
        System.out.println(countOdd);
        //find MAX
        Integer max=list.stream().max(Integer::compareTo).get();
        System.out.println(max);
        // find min
        Integer min=list.stream().min(Integer::compareTo).get();
        System.out.println(min);
        //Max Even
        Integer maxEven=list.stream().filter(x->x%2==0).max(Integer::compareTo).get();
        System.out.println(maxEven);
        //Min Odd
        Integer minOdd=list.stream().filter(x->x%2!=0).min(Integer::compareTo).get();
        System.out.println(minOdd);
    }
}
/*
count() -> Total elements

max() -> Largest element

min() -> Smallest element
*/
