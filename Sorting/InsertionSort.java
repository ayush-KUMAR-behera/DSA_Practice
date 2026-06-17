package Sorting;
import java.util.*;
class InsertionSort{
    public static void main(String[] args){
        int[] a={2,4,5,1,3};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
         System.out.println(Arrays.toString(a));

    }
    public static void insertionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int j=i;
            while(j>0&&a[j-1]>a[j]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }
}