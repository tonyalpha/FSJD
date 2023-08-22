package section16._192_lambda_with_var_and_iterations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Anton"));
        list.add(new Data("Mark"));
        list.add(new Data("Eduart"));
        list.add(new Data("Deda"));
        list.add(new Data("Marleka"));

        list.forEach(data -> {
            System.out.println(data.getName());
        });
    }
}
