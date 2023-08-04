package section15._174_synchronized_block;

public class Brackets {
    public void generate() {
        synchronized (this){
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
