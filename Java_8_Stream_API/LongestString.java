package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Java","Docker","Cloud","Js");
        //Find Longest String
        Optional<String> longestStr=list.stream().sorted((a,b)->b.length()-a.length()).findFirst();
        System.out.println(longestStr.get());
    }
}
