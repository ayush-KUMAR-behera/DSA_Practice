package Heap.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue_MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(40);
        pq.add(35);
        pq.add(25);
        pq.add(12);
        pq.add(30);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        pq.add(22);
        System.out.println(pq);
    }
}
