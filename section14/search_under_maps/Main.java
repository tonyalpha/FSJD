package section14.search_under_maps;

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

        Code code = null;
        for(Map.Entry<Code, String> entry : lectures.entrySet()) {
            if(entry.getValue().equals("OOPS")) {
                code = entry.getKey();
            }
//            System.out.println("Key: " + entry.getKey() + "   |   Value: " + entry.getValue());
        }
        System.out.println("The key for value \"OOPS\"" + code);
    }
}
