package section15._176_static_synchronization;

public class Brackets {
    synchronized static public void generate(String threadCode) {
        for(int i = 1; i<=10 ; i++) {
            if(i<=5) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("Generated by thread: " + threadCode);
    }
}
