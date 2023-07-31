package section13.generic_methods;

import java.util.List;

public class Data {
    public <E> void printListData(List<E> list) {
        for(E element : list) {
            System.out.println(element);
        }
    }

    public <E> void printArrayData(E[] arrayData) {
        for(E element : arrayData) {
            System.out.println(element);
        }
    }
}
