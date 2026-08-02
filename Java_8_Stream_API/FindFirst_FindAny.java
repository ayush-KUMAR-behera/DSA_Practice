package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst_FindAny {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,5,11,-8,23);
        System.out.println(list);
        // Find first odd number
        Optional<Integer> firstOdd=list.stream().filter(x->x%2!=0).findFirst();
        System.out.println(firstOdd.get());
        //First Number >10
        Optional<Integer> ten=list.stream().filter(n->n>10).findFirst();
        System.out.println(ten.get());
        //Any number divisible by 4
        Optional<Integer> divBy4=list.stream().filter(x->x%4==0).findAny();
        System.out.println(divBy4.get());
        // check all are positive
        boolean pos=list.stream().allMatch(x->x>0);
        System.out.println(pos);
        // any negetive number
        boolean neg=list.stream().anyMatch(n->n<0);
        System.out.println(neg);
        // is there any number div by 6
        boolean divBy6=list.stream().noneMatch(num->num%6==0);
        System.out.println(divBy6);
    }
    
}
/*
findFirst() -> First matching element
findAny() -> Any matching element
allMatch()
anyMatch()
noneMatch()
*/
