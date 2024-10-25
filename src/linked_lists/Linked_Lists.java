package linked_lists;

import java.util.LinkedList;

public class Linked_Lists {
    public static void main(String[] args) {
        /**
         * LinkedList = stores Nodes in 2 parts (data + address)
         *              Nodes are in non-consecutive memory locations
         *              Elements are linked using pointers
         */
        LinkedList<String> linkedList = new LinkedList<String>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F")
//        linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E");
//        linkedList.remove();

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);
    }
}
