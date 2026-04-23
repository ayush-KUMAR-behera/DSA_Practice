package Two_Pointer;
import java.util.Arrays;
// problem: 283Leetcode MovesZeroes
//Time:O(n)
//Space:O(1)
public class MovesZero {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,3};
         System.out.println(Arrays.toString(arr));
         movesZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void movesZero(int[] arr){
        int nonZero=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZero];
                arr[nonZero]=temp;
                i++;
                nonZero++;
            }
            else{
                i++;
            }
        }
       
    }
}
