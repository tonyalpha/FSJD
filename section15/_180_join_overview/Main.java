package section15._180_join_overview;

public class Main {
    public int counter = 0;
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<1000; i++) {
                    main.counter++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                for(int i = 0; i<1000; i++) {
                    main.counter++;
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The value of counter: " + main.counter);
    }
}
