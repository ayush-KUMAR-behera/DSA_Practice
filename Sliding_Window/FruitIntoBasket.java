package Sliding_Window;
import java.util.HashMap;
import java.util.Map;
//Problem Fruits into the basket
//Time: O(n)
//Space:O(k)
public class FruitIntoBasket {

    public static void main(String[] args) {
        int[] fruits={0,1,2,2};
        int diff_fruit=2; 
        System.out.println(findFruit(fruits, diff_fruit));
    }
    public static int findFruit(int[] fruits,int diff_fruit){
        int res=0;
        int high=0;
        int low=0;
        Map<Integer,Integer> bucket=new HashMap<>();
        for(high=0;high<fruits.length;high++){
            int value=fruits[high];
            if(bucket.containsKey(value)){
                bucket.put(value,bucket.get(value)+1);
            }else{
                bucket.put(value,1);
            }

            while(bucket.size()>diff_fruit){
                int leftValue=fruits[low];
                bucket.put(leftValue,bucket.get(leftValue)-1);
                if(bucket.get(leftValue)==0){
                    bucket.remove(leftValue);
                }
                low++;
            }

            
                int len=high-low+1;
                res=Math.max(res, len);

        }
        return res;
    }
}