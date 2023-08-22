package section16._191_even_more_lambda;

public class Main {
    public static void main(String[] args) {
        Lambda lambda = () ->
        {
            System.out.println("Statement 1");
            return 10;
        };

        System.out.println(lambda.demo());
    }
}
