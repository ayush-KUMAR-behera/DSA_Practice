package BInary_Search;

public class SearchInRoatedArr {
    public static void main(String[] args) {
        int[] arr={50,60,70,80,90,100,10,20,30,40};
        int target1=70;
        int target2=100;
        int target3=30;
        System.out.println(search(arr, target1));
        System.out.println(search(arr, target2));
        System.out.println(search(arr, target3));
    }
        public static  int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            // first half--> from starting certain part > other part
            if(nums[mid]>nums[nums.length-1])
            {
                    if(nums[mid]<target){
                        low=mid+1;
                    }else{
                        if(nums[0]>target){
                            low=mid+1;
                        }else{
                            high=mid-1;
                        }
                    }
                      continue;
            }
            //second half
            if(nums[mid]>target){
                high=mid-1;
            }else{
                if(target>nums[nums.length-1]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }

        }
        return -1;
    }
}

