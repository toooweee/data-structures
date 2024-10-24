package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        /*
         *  Queue = FIFO data structure. First-In First-Out
         *          A collection designed for holding elements prior to processing
         *          Linear data structure
         *
         *          add = enqueue, offer()
         *          remove = dequeue, poll()
         */

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        String idk = queue.peek();

        System.out.println(idk);

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("Karen"));
    }
}
