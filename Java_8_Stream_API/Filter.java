package Java_8_Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,15,20,25,30,35,40);
        //Even
        List<Integer> even=list.stream().filter(n->n%2==0)
                                    .collect(Collectors.toList());
        System.out.println(even);
        //Odd
        List<Integer> odd=list.stream().filter(num->num%2!=0)
                                            .collect(Collectors.toList());
        System.out.println(odd);
        //Print number greater than 20
        List<Integer> greaterThan20=list.stream().filter(number->number>20)
                                            .collect(Collectors.toList());
        System.out.println(greaterThan20);
        //Print number greater than 25
        List<Integer> lessThan25=list.stream().filter(x->x<25)
                                            .collect(Collectors.toList());
        System.out.println(lessThan25);
        //Number div by 15
        List<Integer> numberDivBy15=list.stream().filter(z->z%15==0)
                                        .collect(Collectors.toList());
        System.out.println(numberDivBy15);
    }
}
/*
Pattern : filter()

Use when:

1. Even Number

2. Odd Number

3. Greater Than

4. Less Than

5. Starts With

6. Salary > 50000

7. Department == IT
*/