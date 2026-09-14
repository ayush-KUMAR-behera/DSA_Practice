package BInary_Search;

import java.util.Arrays;

public class Aggressive_Cows {
    public static void main(String[] args) {
        int[] arr1={1,2,4,8,9};
        int k1=3;
        System.out.println(aggressiveCows(arr1, k1));
        int[] arr2={6,4,3,16,20,7,18,10};
        int k2=5;
        System.out.println(aggressiveCows(arr2, k2));
    }

      public static  int aggressiveCows(int[] arr, int k) {
        
        Arrays.sort(arr);
        
        int res=-1;
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr,k,mid)){
                res=mid;
                low=mid+1;// bcz we find min distance that max
            }else{
                high=mid-1;//bcz our com not stay with maxdist so we low the dist
            }
        }
        return res;
        
    }
    
    public static boolean isPossible(int[] arr,int k,int mid){
        int cow=1;
        int prevPos=arr[0];
        for(int i=1;i<arr.length;i++){
            int dist=arr[i]-prevPos;
            if(dist<mid){
                continue;
            }
            cow++;
            prevPos=arr[i];
        }
        if(cow>=k){
            return true;
        }
        
        return false;
    }
}
