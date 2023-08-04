package section13._153_bounded_type_parameters;

public class Data<K extends Integer,V extends Main> {
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public <E extends Character,N extends Number> void display(E element, N number) {
        System.out.println("Element: " + element + "\nNumber: " + number);
    }
}
