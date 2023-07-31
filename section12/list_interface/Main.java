package section12.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
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

        List<String> names = new LinkedList<>();
        names.add("Anton");
        names.add("Eduart");
        names.add("Mark");

        main.printList(names);
    }

    void printList (List<String> list) {
        for(String element : list) {
            System.out.println("Element: " + element);
        }
        System.out.println("\n");
    }
}
