package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int k1=3;
        System.out.println(subArrSum(arr1, k1));
        int[] arr2={1,-1,0};
        int k2=0;
        System.out.println(subArrSum(arr2, k2));
    }
    public static int subArrSum(int[] a,int k){
        int currSum=0;
        int count=0;
        Map<Integer,Integer> freq=new HashMap<>();
        freq.put(currSum,1);
        for(int i=0;i<a.length;i++){
            currSum=currSum+a[i];
            int prefixSum=currSum-k;
            if(freq.containsKey(prefixSum)){
                count=count+freq.get(prefixSum);
            }
            freq.put(currSum,freq.getOrDefault(currSum,0)+1);
        }

        return count;
    }
}
