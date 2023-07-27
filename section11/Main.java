package section11;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Anton", "Eduart", "Agon", "Arlind", "Arjanit"};

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        System.out.println("******");

        for(String name : stringArray) {
            System.out.println(name);
        }
    }
}
