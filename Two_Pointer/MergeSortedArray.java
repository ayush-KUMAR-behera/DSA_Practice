package Two_Pointer;
import java.util.Arrays;
//Problem: LeetCodde 88 MergeSotedArray
// Time Complexity: O(n+m)  
// Space Complexity: O(n+m)
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,3,7};
        int[] arr2={2,4,4};
        System.out.println(Arrays.toString(mergeArr(arr1, arr2)));
    }
    public static int[] mergeArr(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k++]=arr1[i++];
            }else{
                res[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            res[k++]=arr1[i++];
        }
        while (j<arr2.length) {
            res[k++]=arr2[j++];
        }
      
        return res;
    }
}
