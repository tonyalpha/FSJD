package section13._154_comparable_interface;

public class Data <T extends Comparable<T>> implements Comparable<T>{
    private T myVariable;

    public Data(T myVariable) {
        super();
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myVariable=" + myVariable +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return o.compareTo(getMyVariable());
    }
}
