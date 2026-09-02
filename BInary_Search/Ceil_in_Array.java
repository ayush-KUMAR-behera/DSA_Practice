package BInary_Search;

public class Ceil_in_Array {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 11, 12, 19};
        int target1=5;
        int target2=20;
        System.out.println(findCeil(arr, target1));
        System.out.println(findCeil(arr, target2));
    }
    public static int findCeil(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }else{
                result=mid;
                high=mid-1;
            }
        }
       return result;
    }
}
