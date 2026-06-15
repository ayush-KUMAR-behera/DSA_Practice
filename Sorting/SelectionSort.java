package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={13,46,24,52,20,9};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void selectionSort(int[] a){
        int i=0;
        int j=0;
        int min=0;
        for(i=0;i<a.length-1;i++){
            min=i;
            for(j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
}
