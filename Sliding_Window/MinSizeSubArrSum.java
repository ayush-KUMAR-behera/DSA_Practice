package Sliding_Window;

//Problem: Minimum Size Subarray Sum
//Time: O(n)
//Space: O(1)

public class MinSizeSubArrSum {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(minLength(arr, target));

    }
    public static int minLength(int[] arr,int target){
        int high=0;
        int low=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        while(high<arr.length){
            sum=sum+arr[high];
            while(sum>=target){
                int len=high-low+1;
                if(len<res){
                    res=len;
                }
                sum=sum-arr[low];
                low++;
            }
            high++;
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}
