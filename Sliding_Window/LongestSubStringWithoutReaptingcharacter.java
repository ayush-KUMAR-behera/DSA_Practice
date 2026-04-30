package Sliding_Window;
import java.util.HashMap;
import java.util.Map;

// Problem: Longest SubString Without Reapting Charachter
//Time: O(n)
//Space: O(k)
public class LongestSubStringWithoutReaptingcharacter {
    public static void main(String[] args) {
        String s="pwwekw";
        System.out.println(longestSubString(s));
    }
    public static int longestSubString(String s){
        int low=0;
        int high=0;
        int res=-1;
        Map<Character,Integer> freq=new HashMap<>();
        for( high=0;high<s.length();high++){
            char rightChar=s.charAt(high);
            if(freq.containsKey(rightChar)){
                freq.put(rightChar,freq.get(rightChar)+1);
            }else{
                freq.put(rightChar,1);
            }
            int k=high-low+1;
            while(freq.size()<k){
                char leftChar=s.charAt(low);
                if(freq.containsKey(leftChar)){
                    freq.put(leftChar,freq.get(leftChar)-1);
                }
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                low++;
                k=high-low+1;
            }
            res=Math.max(res, k);
        }
        
        return res;
    }
}
