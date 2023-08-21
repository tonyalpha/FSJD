package section15._181_thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        SomeThread thread1 = new SomeThread("Thread1 ");
        SomeThread thread2 = new SomeThread("Thread2 ");
        SomeThread thread3 = new SomeThread("Thread3 ");
        SomeThread thread4 = new SomeThread("Thread4 ");
        SomeThread thread5 = new SomeThread("Thread5 ");
        SomeThread thread6 = new SomeThread("Thread6 ");
        SomeThread thread7 = new SomeThread("Thread7 ");
        SomeThread thread8 = new SomeThread("Thread8 ");
        SomeThread thread9 = new SomeThread("Thread9 ");
        SomeThread thread10 = new SomeThread("Thread10 ");
        SomeThread thread11 = new SomeThread("Thread11 ");
        SomeThread thread12 = new SomeThread("Thread12 ");
        SomeThread thread13 = new SomeThread("Thread13 ");
        SomeThread thread14 = new SomeThread("Thread14 ");
        SomeThread thread15 = new SomeThread("Thread15 ");
        SomeThread thread16 = new SomeThread("Thread16 ");

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);
        executorService.execute(thread14);
        executorService.execute(thread15);
        executorService.execute(thread16);

        executorService.shutdown();
    }
}
