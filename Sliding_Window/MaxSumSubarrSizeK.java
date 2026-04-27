package Sliding_Window;
//Problem: Max Sum Subarr of Size K
//Time: O(n)
//space:O(1)

public class MaxSumSubarrSizeK {
    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        int k=2;   
        System.out.println(maxSum(arr, k));     
    }
    public static int maxSum(int[] arr,int k){
        int low=0;
        int high=k-1;
        int res=Integer.MIN_VALUE;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum=sum+arr[i];
        }
        while(high<arr.length){
            if(res<sum){
                res=sum;
            }
           low++;
           high++;
           if(arr.length==high){
            break;
           } 
           sum=sum-arr[low-1];
           sum=sum+arr[high];
        }

        return res;
    }

}