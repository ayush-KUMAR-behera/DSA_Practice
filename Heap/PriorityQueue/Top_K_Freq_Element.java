package Heap.PriorityQueue;

import  java.util.*;
/**
 * Top_K_Freq_Element
 */
public class Top_K_Freq_Element {

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }   

     public static  int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=
                new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry :freq.entrySet()){
                minHeap.add(entry);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
        }

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll().getKey();
        }

        return result;

    }


}