package BInary_Search;

import java.util.Arrays;

public class FindFirstLastOccrInArr {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

     public static int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int start=searchFirst(nums,target);
        int end=searchLast(nums,target);
        res[0]=start;
        res[1]=end;
        return res;
    }
    public static int searchFirst(int[] nums,int target){
        int res=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
       public static int searchLast(int[] nums,int target){
        int res=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                res=mid;
                low=mid+1;
            }
        }
        return res;
    }

}
