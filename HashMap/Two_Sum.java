package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
         // int[] arr={2,7,11,15};
        int[] arr={11,7,15,2};
        int target=9;
        System.out.println(findSum(arr,target));
    }
      public static List<Integer> findSum(int[] arr,int target){
        
        Map<Integer,Integer> freq=new HashMap<>();
        List<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int value=target-current;
            if(freq.containsKey(value)){
                res.add(freq.get(value));
                 res.add(i); 
                return res;
            }else{
                freq.put(current,i);
            }
        }

        return Arrays.asList(-1,-1);
    }
}
