package Java_8_Stream_API;

import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String s="Programming";
        s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(
            ch->ch,Collectors.counting()
        )).entrySet().stream().filter(entry->entry.getValue()>1)
        .map(entry->entry.getKey()).forEach(System.out::println);
    }
}
/*
s.chars()--> convert String to intStream
mapToObj-->  convert int to Character
colletc(Collectors.groupingBy())--> group character then count frequency
entrySet()--> get key value pair
getValue()>1-->fillter the repeat charachter
getKey()-->get the character
*/