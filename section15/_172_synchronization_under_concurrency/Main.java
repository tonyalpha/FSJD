package section15._172_synchronization_under_concurrency;

public class Main {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=1000 ; i++) {
                    counter++;
                }
                System.out.println("Thread 1 processed");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=1000 ; i++) {
                    counter++;
                }
                System.out.println("Thread 2 processed");
            }
        });
        thread.start();
        thread2.start();
        Thread.sleep(2000);

        System.out.println("Counter: " +counter);
    }
}
