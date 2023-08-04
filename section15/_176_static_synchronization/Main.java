package section15._176_static_synchronization;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=5 ; i++) {
                    Brackets.generate("Thread 1");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=5 ; i++) {
                    Brackets.generate("Thread 2");
                }
            }
        }).start();
    }
}
