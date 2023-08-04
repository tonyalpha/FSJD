package section15._173_synchronized_method;

/* DOCUMENTATION:
SYNCHRONIZED METHOD APPLIES TO OBJECTS !
A synchronized keyword will add a "lock" to that object.
Using a method in the same object multiple times will cause no issues.
However, using methods from different objects will cause the result to be scuffed.
 */
public class Main {
    public static void main(String[] args) {
        Brackets bracket1 = new Brackets();
        Brackets bracket2 = new Brackets();
        bracket1.generate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=5 ; i++) {
                    bracket1.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=5 ; i++) {
                    bracket2.generate();
                }
            }
        }).start();
    }
}
