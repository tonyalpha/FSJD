package section14._163_treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Code, String> lectures = new TreeMap<>();
        lectures.put(new Code("S01", "L03"), "Generics");
        lectures.put(new Code("S01", "L01"), "Files under Java");
        lectures.put(new Code("S02", "L03"), "Network Programming");
        lectures.put(new Code("S01", "L07"), "OOPS");
        lectures.put(new Code("S01", "L05"), "Methods");
        lectures.put(new Code("S01", "L03"), "Expressions");

        for(Map.Entry<Code, String> entry : lectures.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "   |   Value: " + entry.getValue());
        }
    }
}
