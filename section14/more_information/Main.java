package section14.more_information;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Set<Name> set = new HashSet<>();
        set.add(new Name("Anton"));
        set.add(new Name("Eduart"));
        set.add(new Name("Mark"));
        set.add(new Name("Agon"));
        set.add(new Name("Arlind"));
        set.add(new Name("Arjanit"));
        set.add(new Name("Anton"));

        List<Name> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);

        for(Name name : list) {
            System.out.println(name);
        }
        System.out.println(Collections.binarySearch(list, new Name("Anton")));
        System.out.println(list.get(1));

//        Queue<Integer> queue = new ArrayBlockingQueue<>(6);
//        queue.offer(1);
//        queue.offer(6);
//        queue.offer(7);
//        queue.offer(2);
//        queue.offer(3);
//        queue.offer(4);
//        queue.offer(5);
//
//        List<Integer> list = new ArrayList<>();
//        list.addAll(queue);
//
//        for(Integer element : list) {
//            System.out.println(element);
//        }
    }
}
