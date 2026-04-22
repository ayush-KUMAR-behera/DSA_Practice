package Two_Pointer;
import java.util.Arrays;
//Problem: TwoSum
//TimeComplexity:O(n)
//SpceComplexity:O(1)
public class Two_sum {

        public static void main(String[] args){
        int[] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }else if(nums[i]+nums[j]>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
