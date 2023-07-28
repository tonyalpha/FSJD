package section12.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Albania");
        countries.add("Italy");
        countries.add("Germany");
        countries.add("Belgium");
        countries.add("England");

        Main main = new Main();
        main.printList(countries);

        countries.add(1, "Canada");
        main.printList(countries);

        countries.set(5, "United Kingdom");
        main.printList(countries);

        countries.remove(3);
        main.printList(countries);
    }

    void printList (LinkedList<String> list) {
        for(String element : list) {
            System.out.println("Element: " + element);
        }
        System.out.println("\n");
    }
}
