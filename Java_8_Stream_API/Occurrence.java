package Java_8_Stream_API;

import java.util.Map;
import java.util.stream.Collectors;

public class Occurrence {
    public static void main(String[] args) {
        String s="programming";
        Map<Character,Long> freq=s.chars().mapToObj(ch->(char)ch)
        .collect(Collectors.groupingBy(
            ch->ch,Collectors.counting()
        ));
        System.out.println(freq);
    }
    
}
/*
s.chars()--> convert String to intStream
mapToObj-->  convert int to Character
colletc(Collectors.groupingBy())--> group character then count frequency
 */
