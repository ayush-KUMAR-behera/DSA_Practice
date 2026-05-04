package HashMap;
import java.util.HashMap;
import java.util.Map;

//Problem : RansomNote

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
     public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> res1=new HashMap<>();
        Map<Character,Integer> res2=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(res1.containsKey(ch)){
                res1.put(ch,res1.get(ch)+1);
            }else{
                res1.put(ch,1);
            }
        }

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(res2.containsKey(ch)){
                res2.put(ch,res2.get(ch)+1);
            }else{
                res2.put(ch,1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(res2.containsKey(ch)){
                if(!(res1.get(ch)<=res2.get(ch))){
                    return false;
                } 
            }else{
                return false;
            }
        }

        return true;
    }

}