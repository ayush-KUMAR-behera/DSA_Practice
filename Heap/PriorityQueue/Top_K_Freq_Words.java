package Heap.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Freq_Words {
    public static void main(String[] args) {
        String[] words={"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(words, k));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freq=new HashMap<>();
        for(String str:words){
            freq.put(str,freq.getOrDefault(str,0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> minHeap=
                                new PriorityQueue<>((a,b)->a.getValue().equals(b.getValue())
                                ?b.getKey().compareTo(a.getKey()):a.getValue()-b.getValue()
                                );
        
        for(Map.Entry<String,Integer> entry:freq.entrySet()){
                minHeap.add(entry);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
        }
 
        List<String> result=new ArrayList();

        for(int i=0;i<k;i++){
            result.add(minHeap.poll().getKey());
        }
        
         Collections.reverse(result);
         
        return result;

    }

}
