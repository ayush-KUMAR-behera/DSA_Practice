package HashMap;
import java.util.HashMap;
import java.util.Map;

// Problem : LC 409 Longest Palindrome
// Time : O(n)
//Space : O(1)

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="aaabccd";
        System.out.println(longestPalindrome(s));
    }
      public static int longestPalindrome(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        int res=0;
        boolean odd=false;

        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(int value:freq.values()){
            if(value%2==0){
                res=res+value;
            }else{
                odd=true;
            }
        }

        for(int value:freq.values()){
            if(value%2==1){
                res=res+value-1; // here add pair in odd char //  a a a = 3-1
            }
        }

            if(odd==false){
                return res;
            }
        

        return res+1;// at last you add only 1 char,expect all of them
    }
}
