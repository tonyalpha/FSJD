package section15._174_synchronized_block;

public class Main {
    public static void main(String[] args) {
        Brackets bracket1 = new Brackets();
        Brackets bracket2 = new Brackets();
        bracket1.generate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 1; i<=5 ; i++) {
                    bracket1.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Total time required for this thread: " + (endTime-startTime));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 1; i<=5 ; i++) {
                    bracket2.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Total time required for this thread: " + (endTime-startTime));
            }
        }).start();
    }
}
