package section15._171_implementing_runnable_interface;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));

        thread1.start();
        thread2.start(); */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }).start();
    }
}
