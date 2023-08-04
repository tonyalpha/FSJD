package section15._170_extending_thread_class;

public class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    private void countMe() {
        for(int i = 1; i<=9; i++) {
            try {
                sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("The value of i is: " + i + "   |   The thread number is: " +threadNo);
        }
    }

    @Override
    public void run() {
        countMe();
    }
}
