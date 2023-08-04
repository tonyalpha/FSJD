package section14._158_set_types;

import java.util.HashSet;
import java.util.Set;

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
