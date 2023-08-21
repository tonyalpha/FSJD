package section15._183_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    static int counter = 1;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Producer produce = new Producer(queue);
        Thread producerThread = new Thread(produce);
        producerThread.start();

        Consumer consume = new Consumer(queue);
        Thread consumerThread = new Thread(consume);
        consumerThread.start();
    }
}
