package section12.comparable_interface;

import java.util.*;

class Names {
    private String name;
    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {

        List<Object> elements = new LinkedList();
        elements.add(new Names("Anton"));
        elements.add(new Names("Eduart"));
        elements.add(new Names("Mark"));
        elements.add(new Names("Kristian"));
        elements.add("Some String");
        elements.add(1);
        elements.add(2.0);
        elements.add('#');

        Main main = new Main();
        main.printList(elements);
        System.out.println("\n");

//        Collections.sort(elements);
//        main.printList(elements);
//        System.out.println("\n");

    }

    void printList(List<Object> list) {
        ListIterator<Object> iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}