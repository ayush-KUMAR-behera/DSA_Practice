package Two_Pointer;

import java.util.Arrays;
// LeetCode 26: Remove Duplicates from Sorted Array
// Pattern: Two Pointer
//TimeComplexcity:O(n)
//SpaceComplexcity:O(1)
public class RemoveDuplicateSA {
    public static void main(String[] args){
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        Arrays.sort(arr);
        System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] arr){
        int unique=1;
        int start=0;
        int end=1;
        while(end<arr.length){
            if(arr[end-1]==arr[end]){
                end++;
            }else{
                start++;
                arr[start]=arr[end];
                end++;
                unique++;
            }
        }
        return unique ;
    }
}
