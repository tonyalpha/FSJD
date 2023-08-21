package section15._182_countdown_latch;

import java.util.concurrent.CountDownLatch;

public class SomeThread extends Thread {
    private CountDownLatch latch;

    public SomeThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread running: " +Thread.currentThread().getName());
        System.out.println("Thread execution completed\n\n");
        latch.countDown();
    }
}
