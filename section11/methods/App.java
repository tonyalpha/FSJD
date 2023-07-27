package section11.methods;

public class App {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("Current value of variable in main method is: " + value);
        App app = new App();
        app.displayValue(value);

        System.out.println("\nNames:");

        String[] names = {"Anton", "Eduart", "Agon", "Arlind", "Arjanit"};
        System.out.println(names);
        app.displayNames(names);
        System.out.println("***************");
        System.out.println(names[0]);
    }

    void displayValue(int value) {
        System.out.println("Current value of variable in displayValue is: " + value);
        value = 20;
        System.out.println("New value of variable in displayValue is: " + value);
    }
    void displayNames(String[] names) {
        names[0] = "Salim";
        for(String name : names) {
            System.out.println(name);
        }
    }
}
