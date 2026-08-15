package PrefixSum;

import java.util.*;

public class Contiguous_Array {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(arr));
    }

        public static int findMaxLength(int[] nums) {
        int one=0;
        int zero=0;
        int res=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }

        int diff=one-zero;
        if(diff==0){
            res=Math.max(res,i+1);
            continue;
        }

        if(!freq.containsKey(diff)){
            freq.put(diff,i);
        }
        else{
            int idx=freq.get(diff);
            int len=i-idx;
            res=Math.max(res,len);
        }

        }

        return res;
    }
}
