package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Second_Largest_Smallest {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(4,8,2,9,7,8);
        //find 2nd higest number;
        list.stream().distinct().sorted((a,b)->b-a).skip(1).limit(1).forEach(System.out::println);
       Optional<Integer> secLarge=list.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
       System.out.println(secLarge.get());

         //find 2nd Smallest number
        list.stream().distinct().sorted().skip(1).limit(1).forEach(System.out::println);
       Optional<Integer> secSmall=list.stream().distinct().sorted().skip(1).findFirst();
       System.out.println(secSmall.get());

    }
}
