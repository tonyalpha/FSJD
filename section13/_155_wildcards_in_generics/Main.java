package section13._155_wildcards_in_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Car(1, "Audi A3"));
        display(list);
    }

    //        HIGHER BOUND:
    public static void display(List<? extends Vehicle> list) {
        for(Vehicle element : list) {
            element.info();
        }
    }
    //        LOWER BOUND:
//    public static void display(List<? super Car> list) {
//        for(Object element : list) {
//            System.out.println(element);
//        }
//    }
}
