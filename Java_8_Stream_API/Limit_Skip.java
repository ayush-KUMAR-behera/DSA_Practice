package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_Skip {
 public static void main(String[] args) {
    List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
    System.out.println(list);
    // first 5 number
    List<Integer> firstFive=list.stream().limit(5).collect(Collectors.toList());
    System.out.println(firstFive);
    //Skip Three
    List<Integer> skipThree=list.stream().skip(3).collect(Collectors.toList());
    System.out.println(skipThree);
    //Skip Two take Four
    List<Integer> skip2_Take4=list.stream().skip(2).limit(4).collect(Collectors.toList());
    System.out.println(skip2_Take4);
    //Smallest Three
    List<Integer> smallestThree=list.stream().sorted().limit(3).collect(Collectors.toList());
    System.out.println(smallestThree);
    //LargestThree
    List<Integer> largestThree=list.stream().sorted((a,b)->b-a).limit(3).collect(Collectors.toList());
    System.out.println(largestThree);
 }   
}
/*
Pattern : limit()

Take first N elements

---------------------

Pattern : skip()

Ignore first N elements
*/