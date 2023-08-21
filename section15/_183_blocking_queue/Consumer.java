package section15._183_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                queue.take();
                Main.counter--;
                System.out.println("Value removed from the queue: " +Main.counter);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}