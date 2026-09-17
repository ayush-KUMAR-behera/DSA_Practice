package Heap.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(40);
        pq.add(35);
        pq.add(25);
        pq.add(12);
        pq.add(30);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(99);
        System.out.println(pq.peek());
    }
}
