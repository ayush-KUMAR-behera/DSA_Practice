package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        //Square
        List<Integer> square=list.stream().map(x->x*x)
                                        .collect(Collectors.toList());
        System.out.println(square);
        // Cube
        List<Integer> cube=list.stream().map(y->y*y*y)
                                    .collect(Collectors.toList());
        System.out.println(cube);
        //Double
        List<Integer> doubleValue=list.stream().map(z->z+z)
                                        .collect(Collectors.toList());
        System.out.println(doubleValue);
        // ADD 100
        List<Integer> add100=list.stream().map(a->a+100)
                                        .collect(Collectors.toList());
        //Integer-->String
        List<String> str=list.stream().map(String::valueOf)
                                            .collect(Collectors.toList());
        System.out.println();                                 
    }
}
/*
## map()

Use when:
- Square
- Cube
- Double
- Uppercase
- Lowercase
- Reverse
- Integer -> String
- Employee -> Name
 */