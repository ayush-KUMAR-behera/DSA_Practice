package Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Daily_Temperatures
 */
public class Daily_Temperatures {

    public static void main(String[] args) {
        int[] temperatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
     public static int[] dailyTemperatures(int[] temp) {
        int[] res=new int[temp.length];
        Stack<Integer> s=new Stack<>();
        for(int i=temp.length-1;i>=0;i--){

            while (!s.isEmpty()&&temp[s.peek()]<=temp[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                res[i]=0;
            }else{
                res[i]=s.peek()-i;
            }

            s.push(i);
        
        }
        return res;
    }
}