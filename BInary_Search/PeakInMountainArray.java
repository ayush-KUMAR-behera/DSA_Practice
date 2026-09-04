package BInary_Search;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,6,4,3};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
     int low=0;
     int high=arr.length-1;
     int res=-1;
     while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]<arr[mid+1]){
            low=mid+1;
        }else{
            res=mid;
            high=mid-1;
        }
     } 

     return res;

    }
}
