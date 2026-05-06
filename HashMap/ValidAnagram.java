package HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Problem: Valid Anagram

public class ValidAnagram {

    public static void main(String[] args) {
        String s1="care";
        String s2="race";
        System.out.println(isAnagram1(s1, s2));
        System.out.println(isAnagram2(s1, s2));
        
    }
    // Time : Onlog(n)
    // Space: O(1)
    public static boolean isAnagram1(String s1,String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            return true;
        }
        return false;
    }

    // Time : O(n)
    // Space: O(n)
    public static boolean isAnagram2(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> freq=new HashMap<>();
        for(char ch:s1.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(char ch:s2.toCharArray()){

            if(!freq.containsKey(ch)){
                return false;
            }

            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)-1);
            }

            if(freq.get(ch)==0){
                freq.remove(ch);
            }
        }

        return freq.isEmpty();
    }

}