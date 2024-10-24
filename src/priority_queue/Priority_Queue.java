package priority_queue;

import java.util.*;

public class Priority_Queue {
    public static void main(String[] args) {
        /*
         * Priority queue = A FIFO data structure that serves elements
         *                  with the highest priorities first
         *                  before elements with lower priority
         */

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

//        queue.forEach(que -> {
//            System.out.println(que);
//        });

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
