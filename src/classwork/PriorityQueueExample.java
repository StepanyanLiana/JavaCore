package classwork;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        java.util.Queue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        //Queue - dasavorum u tpum e achman kargov
        priorityQueue.add(70);
        priorityQueue.add(55);
        priorityQueue.add(60);
        priorityQueue.add(66);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        Queue<String> prQ = new PriorityQueue<>();
        prQ.add("Mane");
        prQ.add("Ani");
        prQ.add("Liana");
        prQ.add("Mane");
        System.out.println(prQ);
    }
}
