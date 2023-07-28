package section12.iterators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();

        countries.add("Albania");
        countries.add("Italy");
        countries.add("United Kingdom");
        countries.add("Canada");
        countries.add("Belgium");

        Main main = new Main();
        main.printList(countries);
        System.out.println("\n");

        countries.sort(null);
        main.printList(countries);
        System.out.println("\n");

        Collections.reverse(countries);
        main.printList(countries);
        System.out.println("\n");

    }

    void printList(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
