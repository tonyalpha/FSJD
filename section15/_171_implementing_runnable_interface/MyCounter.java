package section15._171_implementing_runnable_interface;

import java.util.Random;

public class MyCounter implements Runnable {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i<=9; i++) {
            try {
                Thread.sleep(random.nextInt(0,500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value of i is: " + i + "   |   The thread number is: " + threadNo);
        }
    }
}
