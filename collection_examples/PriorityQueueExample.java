package collection_examples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
//        1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.

        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(20);
        integerPriorityQueue.add(40);
        integerPriorityQueue.add(60);
        integerPriorityQueue.add(100);
        integerPriorityQueue.add(30);

        System.out.println("Integer Priority Queue : "+integerPriorityQueue);

//        2. Write a Java program to iterate through all elements in the priority queue.

        Iterator it= integerPriorityQueue.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
//        3. Write a Java program to add all the elements of a priority queue to another priority queue.

        PriorityQueue<Integer> integerPriorityQueue1 = new PriorityQueue<>(integerPriorityQueue);
        System.out.println("Integer Priority Queue 1 : "+integerPriorityQueue1);

//        4. Write a Java program to insert a given element into a priority queue.

        integerPriorityQueue1.add(200);
        System.out.println("Integer Priority Queue 1 : "+integerPriorityQueue1);

//        5. Write a Java program to remove all elements from a priority queue.

        integerPriorityQueue.clear();
        System.out.println("Integer Priority Queue : "+integerPriorityQueue);

//        6. Write a Java program to count the number of elements in a priority queue.

        System.out.println("Integer Priority Queue 1 Size : "+integerPriorityQueue1.size());

//        7. Write a Java program to compare two priority queues.


//        8. Write a Java program to retrieve the first element of the priority queue.


//        9. Write a Java program to retrieve and remove the first element.


//        10. Write a Java program to convert a priority queue to an array containing all its elements.


//        11. Write a Java program to convert a Priority Queue element to string representations.


//        12. Write a Java program to change priorityQueue to maximum priority queue.


    }
}
