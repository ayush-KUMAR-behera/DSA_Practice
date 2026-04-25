package Two_Pointer;
import java.util.Arrays;
//Problem: Leetcode 16. 3Sum Closest
//Time:O(n^2)
//Space:O(n)

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr={-1,2,1,4};
        int target=1;
        System.out.println(findClosetSum(arr, target));
    }
    public static int findClosetSum(int[] arr,int targrt){
        Arrays.sort(arr);
        int max_diff=Integer.MAX_VALUE;
        int res_diff=0;
        for(int i=0;i<arr.length-2;i++){
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                int sum=arr[i]+arr[low]+arr[high];
                int diff=Math.abs(sum-targrt);
                if(max_diff>diff){
                    max_diff=diff;
                    res_diff=sum;
                }
                if(sum==targrt){
                    return sum;
                }else if(sum>targrt){
                    high--;
                }else{
                    low++;
                }
            }
        }

        return res_diff;
    }
}