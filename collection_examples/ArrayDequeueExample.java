package collection_examples;

import java.util.ArrayDeque;

public class ArrayDequeueExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(92);
        arrayDeque.add(32);
        arrayDeque.add(63);
        arrayDeque.add(74);

        System.out.println(arrayDeque);

        arrayDeque.addFirst(10);
        arrayDeque.addLast(20);

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.remove());
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque);

        arrayDeque.removeLastOccurrence(32);
        System.out.println(arrayDeque);
    }
}
