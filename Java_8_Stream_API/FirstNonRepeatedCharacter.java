package Java_8_Stream_API;

import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s="aabcce";
        Optional<Character> firstChar=s.chars().mapToObj(ch->(char)ch)
        .collect(Collectors.groupingBy(ch->ch,Collectors.counting()))
        .entrySet().stream().filter(entry->entry.getValue()==1).map(key->key.getKey()).findFirst();
         System.out.println(firstChar.get());
    }
}