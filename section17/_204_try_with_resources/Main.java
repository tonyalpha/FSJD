package section17._204_try_with_resources;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter int value: ");
            int x = scanner.nextInt();
            System.out.println(x);
        }
    }
}
