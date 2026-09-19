package Heap.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest {
    public static void main(String[] args) {
        int[] arr={10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k=4;
        System.out.println(kthSmallest(arr, k));
    }

     public static int kthSmallest(int[] arr, int k) {

    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

      for(int i=0;i<k;i++){
          pq.add(arr[i]);
      }
      
      for(int i=k;i<arr.length;i++){
          if(pq.peek()>arr[i]){
              pq.poll();
              pq.add(arr[i]);
          }
          continue;
      }
      
      return pq.peek();
        
    }
}
