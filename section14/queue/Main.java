package section14.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(6);

        System.out.println(queue.poll());

        System.out.println(queue.offer(10));
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        System.out.println(queue.offer(7)); // CRASHES THE APPLICATION, QUEUE FULL
        for (Integer element : queue) {
            System.out.println(element);
        }
        System.out.println(queue.peek());

        for (Integer element : queue) {
            System.out.println(element);
        }
    }
}
