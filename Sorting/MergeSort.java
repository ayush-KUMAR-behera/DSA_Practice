package Sorting;

import java.util.Arrays;
// Time : O(n log n)
// Space :O(n)
public class MergeSort {
    public static void main(String[] args) {
        int[] a={3,4,1,5,2};
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
    public static void mergeSort(int[] a,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(a, low,mid);
        mergeSort(a,mid+1, high);
        merge(a, low, mid, high);
    }

    public static void merge(int[] a,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int i=0;
        while (left<=mid && right<=high) {
             if(a[left]<a[right]) {
                temp[i++]=a[left++];
            }else{
                temp[i++]=a[right++];
            }
        }

        while (left<=mid) {
            temp[i++]=a[left++];
        }

        while (right<=high) {
            temp[i++]=a[right++];
        }
            for(int j=low;j<=high;j++){
                a[j]=temp[j-low];
            }
    }
}
