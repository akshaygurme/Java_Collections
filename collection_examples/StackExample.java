package collection_examples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        System.out.println(integerStack);
        System.out.println(integerStack.get(1));
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
        System.out.println(integerStack);
    }
}
