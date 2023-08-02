package section13.bounded_type_parameters;

public class Main {
    public static void main(String[] args) {
        Data<Integer, Main> data = new Data<Integer, Main>(1, new Main());
        data.getValue().test();
        data.display('E', 1.2F);
        System.out.println(data.getKey());
    }

    public void test() {
        System.out.println("Testing...");
    }
}
