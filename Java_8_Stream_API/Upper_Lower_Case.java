package Java_8_Stream_API;

import java.util.Arrays;
import java.util.List;

public class Upper_Lower_Case {
    public static void main(String[] args) {
           // convert to UpperCase
        String s1="SpringBoot";
        String upper=s1.chars().map(Character::toUpperCase)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(upper);
        // convertAll to UpperCase
        List<String> list1=Arrays.asList("Ai","llm","ml");
        list1.stream().map(String::toUpperCase).forEach(System.out::println);

        //Convert to lowwer case
        String s2="MICROSERVICE";
        String lower=s2.chars().map(Character::toLowerCase)
                    .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(lower);
        //Convert all to lower case
            List<String> list2=Arrays.asList("AWS","GCP","AZURE");
        list2.stream().map(String::toLowerCase).forEach(System.out::println);
        
    }
}
