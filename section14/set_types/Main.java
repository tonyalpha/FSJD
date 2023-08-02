package section14.set_types;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for(int i = 30; i>0; i--) {
            set.add("A" + i);
        }

        for(String i : set) {
            System.out.println(i);
        }
    }
}
