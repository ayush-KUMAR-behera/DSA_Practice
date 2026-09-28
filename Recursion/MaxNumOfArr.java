package Recursion;

/**
 * MaxNumOfArr
 */
public class MaxNumOfArr {
public static void main(String[] args) {
    int[] arr={1,4,6,2,3};
    System.out.println(max(arr,arr.length));

}
public static int max(int[] arr,int n){
    if(n==1){
        return arr[n-1];
    }
    int last=arr[n-1];
    int answer=max(arr, n-1);
    return  Math.max(last, answer);
}
    
}