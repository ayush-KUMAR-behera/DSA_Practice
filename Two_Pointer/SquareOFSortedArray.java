package Two_Pointer;
import java.util.Arrays;

//Problem: Square of Sorted Array
//Time: O(n)
//Space: O(n)

public class SquareOFSortedArray {     
     public static void main(String[] args) {
        int[] arr={-4,-1,0,3,9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(squareArr(arr)));
    }

    // O p t i m i z e
    public static int[] squareArr(int[] arr){
        int[] res=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        int index=arr.length-1;
        while(left<=right){
            int leftSq=(arr[left] * arr[left]);
            int rightSq=(arr[right] * arr[right]);
            if(leftSq>rightSq){
                res[index--]=leftSq;
                left++;
            }else{
                res[index--]=rightSq;
                right--;
            }
        }
        return res;
    }

    // B r u t e F o r c e

    // public static void SquareArr(int[] arr){
    //     System.out.println(Arrays.toString(arr));
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=arr[i]*arr[i];
    //     }
    //     Arrays.sort(arr);
    //     System.out.println(Arrays.toString(arr));
    // }
}
