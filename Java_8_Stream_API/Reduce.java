package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
     
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,9,8,10);
        System.out.println(list);
        //Sum of all number
        Integer sum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        //Product of all num
        Integer prod=list.stream().reduce(1, (a,b)->a*b);
        System.out.println(prod);
        //Sum of Even
        Integer evenSum=list.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b);
        System.out.println(evenSum);
        //Sum of Odd
        Integer oddSum=list.stream().filter(n->n%2==1).reduce(0,(a,b)->a+b);
        System.out.println(oddSum);
        // Maximum using reduce;
        Integer maxNum=list.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
        System.out.println(maxNum);
        //Minimum using reduce
        Integer minNum=list.stream().reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b);
        System.out.println(minNum);
        
    }
}
/*
Pattern : reduce()

Use when:
1. Sum
2. Product
3. Maximum
4. Minimum
*/