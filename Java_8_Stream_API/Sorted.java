package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(4,8,2,1,9);
        // Sort in Ascending
      List<Integer> asc=list.stream().sorted((a,b)->a-b).collect(Collectors.toList());
      System.out.println(asc);
      //Sort in Decending
      List<Integer> des=list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
      System.out.println(des);
      // Sort Only even number
      List<Integer> sortEvem=list.stream().filter(n->n%2==0).sorted()
                                .collect(Collectors.toList());
      System.out.println(sortEvem);
      // Square then Sort
      List<Integer> sqSort=list.stream().map(x->x*x).sorted()
                            .collect(Collectors.toList());
        System.out.println(sqSort);
      //Descending Odd numbers
      List<Integer> descOdd=list.stream().filter(z->z%2!=0).sorted((a,b)->b-a)
                                .collect(Collectors.toList());
        System.out.println(descOdd);
    }
}
/*
Pattern : sorted()

Use when:

1. Ascending
2. Descending
3. Highest First
4. Lowest First
5. Alphabetical Order
*/