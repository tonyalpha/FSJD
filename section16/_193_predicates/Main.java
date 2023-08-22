package section16._193_predicates;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate lessThan18 = i->i<18;
        IntPredicate moreThan10 = i->i>10;

        demo(13, lessThan18, moreThan10);

    }

    public static void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10) {
        if(lessThan18.and(moreThan10).test(x)) {
            System.out.println("The input is less than 18 and more than 10");
        } else {
            System.out.println("Invalid input");
        }
    }
}
