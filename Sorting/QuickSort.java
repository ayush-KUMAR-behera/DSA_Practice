package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={4,3,1,5,2};
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
    public static void quickSort(int [] a,int low,int high){
    
        if(low<high){
            int pivotIndex=findPivot(a, low, high);
            quickSort(a, low,pivotIndex-1);
            quickSort(a,pivotIndex+1, high);
        }
    }

    public static int findPivot(int[] a,int low,int high){
        int left=low;
        int right=high;
        int pivot=a[low];
        while (left<right) {
            while (a[left]<=pivot && left<=high) {
                left++;
            }
            while (a[right]>pivot && right>=low) {
                right--;
            }
            if(left<right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
        }
        int temp=a[right];
        a[right]=a[low];
        a[low]=temp;
        return right;
    }
}
