package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Map {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,5,6,7,10,22,33);
        //Square of even number
        List<Integer> sqOfEvenNum=list.stream().filter(x->x%2==0)
                                .map(x->x*x).collect(Collectors.toList());
        System.out.println(sqOfEvenNum);
        //Cube od ODD number
        List<Integer> cubeOfOddNum=list.stream().filter(y->y%2!=0)
                                .map(y->y*y*y).collect(Collectors.toList());
        System.out.println(cubeOfOddNum);
        //Double numbers greater than 20
        List<Integer> doubleNum=list.stream().filter(x->x>20).map(x->x*2)
                                            .collect(Collectors.toList());
        //Convert Even num to String
        List<String> evenStr=list.stream().filter(z->z%2==0)
                             .map(String::valueOf).collect(Collectors.toList());
        System.out.println(evenStr);

    }
}
/*
## filter() + map()

Pattern

Filter

↓

Map

↓

Print/Collect
 */
