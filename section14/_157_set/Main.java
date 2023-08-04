package section14._157_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Anton");
        set.add("Eduart");
        set.add("Mark");
        set.add("Kristian");
        set.add("Chaand");

        for(String name : set) {
            System.out.println(name);
        }
        System.out.println(set.contains(1));
    }
}
