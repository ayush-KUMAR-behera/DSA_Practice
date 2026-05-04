package HashMap;
import java.util.HashMap;
import java.util.Map;

//Problem : LC 387 First Unique Character String
// Time : O(n)
//Space : O(n) 

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int n=s.length();
        Map<Character,Integer> res=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(res.containsKey(ch)){
                res.put(ch,res.get(ch)+1);
            }else{
                res.put(ch,1);
            }
        }

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(res.get(ch)==1){
                return i;
            }
        }

        return -1;
    }
}
