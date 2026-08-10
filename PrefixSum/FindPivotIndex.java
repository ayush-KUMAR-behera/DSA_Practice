package PrefixSum;

/**
 * FindPivotIndex
 */
public class FindPivotIndex {

    public static void main(String[] args) {
        int[] arr1={2,3,1,3,4,2};
        int[] arr2={2,1,-1};
        System.out.println(pivotIndex(arr1));
        System.out.println(pivotIndex(arr2));
    }
     public static int pivotIndex(int[] arr) {
        int left=0;
        int right=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            right=sum-left-arr[i];
            if(left==right){
                return i;
            }
            left=left+arr[i];
        }
        return -1;
    }
}