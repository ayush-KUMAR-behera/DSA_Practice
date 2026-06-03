package KadaneAlgo;
//Problem: minimum SubArray
//Time:  O(n)
//Space: O(1)
public class MinimumSubArray {
    public static void main(String[] args) {
         int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(minSubArray(a));
    }

    public static int minSubArray(int[] a){
        int ans=a[0];
        int bestEnd=a[0];
        for(int i=1;i<a.length;i++){
            int v1=a[i];
            int v2=bestEnd+a[i];
            bestEnd=Math.min(v1,v2);
            ans=Math.min(ans, bestEnd);
        }
        return ans;
    }
}
