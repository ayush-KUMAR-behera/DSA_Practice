package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterII {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
     public static int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        Stack<Integer> s=new Stack();
        for(int i=nums.length-2;i>=0;i--){
            s.push(nums[i]);
        }

        for(int j=nums.length-1;j>=0;j--){
            while(!s.isEmpty()&&s.peek()<=nums[j]){
                s.pop();
            }

            if(s.isEmpty()){
                res[j]=-1;
            }else{
                res[j]=s.peek();
            }

            s.push(nums[j]);
        }

        return res;

    }
}
