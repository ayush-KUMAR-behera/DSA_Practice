package BInary_Search;

public class FindMinInRoatedSortedArray {
public static void main(String[] args) {
    int[] arr={5,6,7,1,2,3,4};
    System.out.println(findMin(arr));
}

public  static int findMin(int[] arr){
    int low=0;
    int high=arr.length-1;
    int res=-1;

    while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]>arr[arr.length-1]){
            low=mid+1;
        }else{
            res=mid;
            high=mid-1;
        }
    }

    return  res;
}

}