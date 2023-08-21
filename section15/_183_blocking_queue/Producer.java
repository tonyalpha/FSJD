package section15._183_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;


    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(5000);
                queue.put(Main.counter++);
                System.out.println("Value added in the queue: " +Main.counter);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
