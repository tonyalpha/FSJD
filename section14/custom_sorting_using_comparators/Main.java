package section14.custom_sorting_using_comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data <Integer, String> obj2) {
                if (obj1.getKey() < obj2.getKey()) {
                    return -1;
                } else if (obj1.getKey() > obj2.getKey()) {
                    return 1;
                }
                return 0;
            }
        };

        Comparator<Data<Integer, String>> COMPARE_NAMELENGTH = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                if(obj1.getValue().length() < obj2.getValue().length()) {
                    return -1;
                } else if (obj1.getValue().length() > obj2.getValue().length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
        set.add(new Data<>(1, "Anton"));
        set.add(new Data<>(5, "Eduart"));
        set.add(new Data<>(9, "Mark"));
        set.add(new Data<>(2, "Kristian"));
        set.add(new Data<>(5, "Fatjon"));

        for(Data<Integer, String> element: set) {
            System.out.println(element);
        }
    }
}
