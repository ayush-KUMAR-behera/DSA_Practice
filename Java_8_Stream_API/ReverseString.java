package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;


public class ReverseString {
    public static void main(String[] args) {
        String s="Backend";
        //Revsre String 
      String rev=s.chars().mapToObj(ch->String.valueOf((char)ch)).reduce("",(str,ch)->ch+str);
        System.out.println(rev);
        //Reverse All String
        List<String> list=Arrays.asList("Cloud","Java","CSS","IT");
        list.stream().map(str->new StringBuilder(str).reverse().toString())
        .forEach(System.out::println);
    }
}
