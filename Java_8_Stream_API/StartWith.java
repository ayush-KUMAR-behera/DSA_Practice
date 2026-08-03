package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;

public class StartWith {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Cloud","Spring","C++","ORM","CSS");
        //Count Start with C
        Long c=list.stream().filter(s->s.startsWith("C")).count();
        System.out.println(c);
        //Print all Start with C
        list.stream().filter(s->s.startsWith("C"))
        .forEach(System.out::println);
    }
}
