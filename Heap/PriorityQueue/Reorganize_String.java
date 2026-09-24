package Heap.PriorityQueue;

import  java.util.*;

class Pair {
    int key;       
    char value;    

    Pair(int key, char value) {
        this.key = key;
        this.value = value;
    }
}

public class Reorganize_String {
    public static void main(String[] args) {
        String s="aaab";
        String s2="aabbb";
        System.out.println(reorganizeString(s));
        System.out.println(reorganizeString(s2));
    }


public static String reorganizeString(String s) 
{
        Map<Character,Integer> counts=new HashMap<>();
        for(char ch:s.toCharArray()){
            counts.put(ch,counts.getOrDefault(ch,0)+1);
        }

      PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> {
    if (a.key != b.key) {
        return b.key - a.key;
    }
    return b.value - a.value;
    });

    for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
    maxHeap.add(new Pair(entry.getValue(), entry.getKey()));
        }
            int seat=0;
            StringBuilder res=new StringBuilder();
        while(!maxHeap.isEmpty()){
             Pair p1=maxHeap.poll();
            if(seat==0||res.charAt(res.length()-1)!=p1.value){
            
                int k1=p1.key;
                res.append(p1.value);
                k1--;
                if(k1>0){
                    maxHeap.add(new Pair(k1,p1.value));
                }
                seat++;
            }else{
                if(maxHeap.isEmpty()){
                    return "";
                }else{
                    Pair p2=maxHeap.poll();
                     int k2=p2.key;
                res.append(p2.value);
                k2--;
                if(k2>0){
                    maxHeap.add(new Pair(k2,p2.value));
                }
                seat++;
                    maxHeap.add(p1);
                }
            }
        }

        return res.toString();
}

}