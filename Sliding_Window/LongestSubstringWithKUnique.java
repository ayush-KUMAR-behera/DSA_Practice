package Sliding_Window;
import java.util.HashMap;
import java.util.Map;

// Problem: Longest SubString with K unique
// Time: O(n)
// Space:O(n)

public class LongestSubstringWithKUnique {

    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        System.out.println(longestSubstring(s, k));
    }
    public static int longestSubstring(String s,int k){
        int res=-1;
        int high=0;
        int low=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(high=0;high<s.length();high++){
            char ch=s.charAt(high);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }else{
                freq.put(ch,1);
            }
            while(freq.size()>k){
                char leftChar=s.charAt(low);
                freq.put(leftChar,freq.get(leftChar)-1);
                if(freq.get(leftChar)==0){
                    freq.remove(leftChar);
                }
                low++;
            }
            if(k==freq.size()){
                int len=(high-low)+1;
                res=Math.max(res, len);
            }
        }
        return res;
    }
}