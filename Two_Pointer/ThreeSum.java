package Two_Pointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Problem: Leetcode13 3Sum
//time: O(n^2)
//spce: O(1)
public class ThreeSum {

    public static void main(String[] args) {
      int[] arr={-1,0,1,2,-1,-4};
      System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length-2;
        for(int i=0;i<n;i++){
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            int target=-1*arr[i];
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(target==sum){
                        res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                        left++;
                        right--;
                    while (left<arr.length && arr[left]==arr[left-1]) {
                        left++;
                    }
                    while (right>0&&arr[right]==arr[right+1]) {
                        right--;
                    }
                }
                else if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}