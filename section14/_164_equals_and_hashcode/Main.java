package section14._164_equals_and_hashcode;

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
//            System.out.println("Key: " + entry.getKey() + "   |   Value: " + entry.getValue());
        }
        Code code1 = new Code("S01", "L03");
        Code code2 = new Code("S01", "L03");
        System.out.println("Code1 hashcode: " + code1.hashCode() +
                "\nCode2 hashcode: " + code2.hashCode());
        System.out.println(code1.equals(code2));
        System.out.println(code1 == code2);
    }
}
