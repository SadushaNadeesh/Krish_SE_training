package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sadusha
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to 
        // the queue 
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue. 
        System.out.println("Elements of queue "
                + q);

        // To remove the head of queue. 
        int removedele = q.remove();
        System.out.println("removed element-"
                + removedele);

        System.out.println(q);

        // To view the head of queue 
        int head = q.peek();
        System.out.println("head of queue-"
                + head);

        // Rest all methods of collection 
        // interface like size and contains 
        // can be used with this 
        // implementation. 
        int size = q.size();
        System.out.println("Size of queue-"
                + size);
    }
}
/*
Elements of queue [0, 1, 2, 3, 4]
removed element-0
[1, 2, 3, 4]
head of queue-1
Size of queue-4
*/