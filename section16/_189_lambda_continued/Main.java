package section16._189_lambda_continued;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("I am inside thread 1");
            System.out.println("This is line 2");
        }).start();

    }
}
