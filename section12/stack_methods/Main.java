package section12.stack_methods;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.pop();

        System.out.println("Peek: " + demo.peek());

        if(demo.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }

        for(Integer temp : demo) {
            System.out.println(temp);
        }

        System.out.println(demo.search(56));
    }
}
