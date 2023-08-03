package section14.dequeue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedBlockingDeque<>();

        System.out.println(deque.poll());

        System.out.println(deque.offer(10));
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);
        deque.offer(6);
        System.out.println(deque.offer(7)); // CRASHES THE APPLICATION, QUEUE FULL
        for (Integer element : deque) {
            System.out.println(element);
        }
        System.out.println(deque.peek());

        for (Integer element : deque) {
            System.out.println(element);
        }
        System.out.println("\n");
        deque.addFirst(0);
        deque.removeLast();

        for (Integer element : deque) {
            System.out.println(element);
        }
    }
}
