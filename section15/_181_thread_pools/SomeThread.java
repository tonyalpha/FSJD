package section15._181_thread_pools;

public class SomeThread extends Thread {
    private String name;

    public SomeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread " + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Ending thread: " + name);
    }
}
