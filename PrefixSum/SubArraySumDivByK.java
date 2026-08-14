package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivByK {
    public static void main(String[] args) {
        int[] arr={4,5,0,-2,-3,1};
        int k=5;
        System.out.println(subarraysDivByK(arr,k));
    }
     public static int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        int sum=0;
        Map<Integer,Integer> freq=new HashMap<>();
        freq.put(sum,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(freq.containsKey(rem)){
                ans=ans+freq.get(rem);
            }
            freq.put(rem,freq.getOrDefault(rem,0)+1);
        }
        return ans;
}
}
