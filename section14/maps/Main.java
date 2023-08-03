package section14.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap(10);
        student.put(3, "Mark");
        student.put(1, "Anton");
        student.put(2, "Eduart");
        student.put(7, "Agon");
        student.put(5, "Arlind");
        student.put(10, "Arjanit");

//        for(Map.Entry<Integer, String> entry : student.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + "   |   Value: " + entry.getValue());
//        }
//        System.out.println("Student 3 is: " +student.get(3));

//        for(Integer key : student.keySet()) {
//            System.out.println("Key: " + key + "   |   Value: " + student.get(key));
//        }
        Iterator<Map.Entry<Integer, String>> entry = student.entrySet().iterator();
        while(entry.hasNext()) {
            Map.Entry<Integer, String> temp = entry.next();
            System.out.println("Key: " + temp.getKey() + "   |   Value: " + temp.getValue());
        }
    }
}
