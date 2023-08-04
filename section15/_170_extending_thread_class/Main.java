package section15._170_extending_thread_class;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("__________________________________________________");
        counter2.start();
        Thread.sleep(4505);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required to process: " + (endTime-startTime));
    }
}
