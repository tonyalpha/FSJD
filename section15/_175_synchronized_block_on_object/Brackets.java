package section15._175_synchronized_block_on_object;

/*
DOCUMENTATION:
Used a "lock" Object instead of "this" to encapsulate the method.
Now it cannot be altered from outside influence.
 */

public class Brackets {

    private Object lock = "lock";
    public void generate() {
        synchronized (lock){
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                if (i <= 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }

        {
            for (int j = 0; j <= 10; j++) {
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }
}
