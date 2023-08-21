package section15._182_countdown_latch;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);

        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            latch.await();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("I am in main thread: " + Thread.currentThread().getName());
    }
}
