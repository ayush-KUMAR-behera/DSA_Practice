package Two_Pointer;
// Problem: Remove Element
// Pattern: Two Pointer
// Time: O(n)
// Space: O(1)


public class Remove_Element {
    public static void main(String[] args){
        int[] arr={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(arr,val));
    }
      public static int removeElement(int[] nums, int val) {
        int nonValue=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[nonValue];
                nums[nonValue]=temp;
                nonValue++;
                i++;
            }else{
                i++;
            }
        }
        return nonValue;
    }
}
