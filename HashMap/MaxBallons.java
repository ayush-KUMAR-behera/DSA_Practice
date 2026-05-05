package HashMap;
import java.util.HashMap;
import java.util.Map;
// Problem : Max Number of ballons
// Time: O(n)
// Space: O(1)

public class MaxBallons {

    public static void main(String[] args) {
        String text="loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
   
    }

    //Using 2 HashMap
    public static int maxNumberOfBalloons(String text) {
        String given="balloon";
        int result=Integer.MAX_VALUE;
        Map<Character,Integer> have=new HashMap<>();
         Map<Character,Integer> need=new HashMap<>();
        for(char ch:text.toCharArray()){
             have.put(ch, have.getOrDefault(ch,0)+1);
        }

         for(char ch:given.toCharArray()){
             need.put(ch, need.getOrDefault(ch,0)+1);
        }
        
        for(char ch:need.keySet()){
            int ans=have.getOrDefault(ch,0) /need.get(ch);
          result=Math.min(ans, result);
        }

     return result;   
    }
}