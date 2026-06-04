package KadaneAlgo;

// Problem: LC: Maximum sub array product
//Time: O(n)
//space: O(1)

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] a={-2,3,-4};
        System.out.println(maxProduct(a));
    }
    public static int maxProduct(int[] a){
         int maxEnd=a[0];
         int minEnd=a[0];
         int maxProd=a[0];
         for(int i=1;i<a.length;i++){
            int v1=a[i];
            int v2=maxEnd*a[i];
            int v3=minEnd*a[i];
            maxEnd=Math.max(v1,Math.max(v2, v3));
            minEnd=Math.min(v1,Math.min(v2,v3));
            maxProd=Math.max(maxProd,Math.max(maxEnd,minEnd));
         }
         return maxProd;
    }
}
