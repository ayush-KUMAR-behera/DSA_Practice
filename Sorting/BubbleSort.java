package Sorting;

import java.util.Arrays;

// Time : best o(n)
//      : wrost=avg= O(n^2) 

public class BubbleSort {
    public static void main(String[] args) {
            // find the max and do adjecent swap
            int[] a={4,3,1,5,2};
            // int[] a={1,2,3,4,5};  // --> bestCASE
            System.out.println(Arrays.toString(a));
            bubbleSort(a);
              System.out.println(Arrays.toString(a));
    }
    
    public static void bubbleSort(int[] a){
        int count=1;
        for(int i=a.length-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp; 
                    didSwap=1;
                }
            }
            System.out.println("swap"+count++);
            if(didSwap==0){
                break;
            }
        }
    }
    
}

