package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
   public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,2,5,3,8);
        //Remove duplicates
        List<Integer> dup=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(dup);
        // Remove duplicate & sort
        List<Integer> dupSort=list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(dupSort);
        //Remove Duplicate and sort Decending
        List<Integer> dupDesc=list.stream().distinct().sorted((a,b)->b-a)
                                .collect(Collectors.toList());
        System.out.println(dupDesc);
        //Square then remove duplicate
        List<Integer> sqDup=list.stream().map(x->x*x).distinct()
                                .collect(Collectors.toList());
        System.out.println(sqDup);
   }    
}
/*
Pattern : distinct()

Use when:

1. Remove Duplicate
2. Unique Values
3. Unique Employees
*/