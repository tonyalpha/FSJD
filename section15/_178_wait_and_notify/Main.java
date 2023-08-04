package section15._178_wait_and_notify;

public class Main {
    static public int balance = 0;
    public void withdraw(int amount) {
        synchronized (this){
            System.out.println("Trying to withdraw: " + amount);
            if (balance <= 0) {
                try {
                    System.out.println("Insufficient funds." +
                            "\nWaiting for funds to update.");
                    wait();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Balance left: " + balance);
    }

    public void deposit(int amount) {
        System.out.println("Depositing amount: " + amount);
        balance += amount;
        System.out.println("New balance: " + balance);
        synchronized (this){
            notifyAll();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.withdraw(1000);
            }
        });
        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                main.deposit(2000);
            }
        });
        thread2.setName("Thread 2");
        thread2.start();
    }
}
