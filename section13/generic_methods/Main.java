package section13.generic_methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Data data = new Data();
        data.printListData(list);
        System.out.println("\n");

        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");
        data.printListData(list2);
        System.out.println("\n");

        String[] stringArray = {"One in array", "Two in array", "Three in array"};
        data.printArrayData(stringArray);
        System.out.println("\n");

        Integer[] integerArray = {1,2,3,4};
        data.printArrayData(integerArray);
        System.out.println("\n");
    }
}
