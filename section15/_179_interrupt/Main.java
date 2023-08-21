package section15._179_interrupt;

public class Main {
    static public int balance = 0;
    public void withdraw(int amount) {
        synchronized (this){
            if (balance <= 0 || balance < amount) {
                try {
                    System.out.println("Insufficient funds." +
                            "\nWaiting for funds to update.");
                    wait();
                } catch (InterruptedException ie) {
                    System.out.println("Withdrawing " + amount + " from balance.");
                    balance -= amount;
                    System.out.println("Balance left: " + balance);
                }
            } else {
                System.out.println("Withdrawing " + amount + " from balance.");
                balance -= amount;
                System.out.println("Balance left: " + balance);
            }
        }
    }

    public void deposit(int amount) {
        System.out.println("Depositing amount: " + amount);
        balance += amount;
        System.out.println("New balance: " + balance);
    }
    public static void main(String[] args) {
        Main main = new Main();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.withdraw(1000);
            }
        });
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
                thread1.interrupt();
            }
        });
        thread2.start();
    }
}
