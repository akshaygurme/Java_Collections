package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {

//    1. Write a Java program to append the specified element to the end of a linked list.

        System.out.println("1. Write a Java program to append the specified element to the end of a linked list.");
        List<Integer> linkedList = new LinkedList();
        linkedList.add(10);
        System.out.println(linkedList);
        linkedList.add(5);
        System.out.println(linkedList);
        linkedList.add(6);
        System.out.println(linkedList);
        System.out.println(linkedList.size());


//2. Write a Java program to iterate through all elements in a linked list.

        System.out.println("2. Write a Java program to iterate through all elements in a linked list.");
        for(int element : linkedList){
            System.out.println(element);
        }


//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

//4. Write a Java program to iterate a linked list in reverse order.

        System.out.println("4. Write a Java program to iterate a linked list in reverse order.");
        LinkedList<String > stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Red");
        stringLinkedList.add("Green");
        stringLinkedList.add("Yellow");
        stringLinkedList.add("Blue");
        System.out.println("String Linked List : "+stringLinkedList);

        for(int i=stringLinkedList.size()-1;i>=0;i--)
        {
        System.out.println(stringLinkedList.get(i));
        }
        Collections.reverse(stringLinkedList);
        System.out.println("Reversed String Linked List : "+stringLinkedList);

//5. Write a Java program to insert the specified element at the specified position in the linked list.

        System.out.println("5. Write a Java program to insert the specified element at the specified position in the linked list.");
        stringLinkedList.add(2,"Voilet");
        System.out.println("String Linked List : "+stringLinkedList);

//6. Write a Java program to insert elements into the linked list at the first and last positions.

        System.out.println("6. Write a Java program to insert elements into the linked list at the first and last positions.");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);

        stringLinkedList.addFirst("Brown");
        stringLinkedList.addLast("Black");
        System.out.println("String Linked List : "+stringLinkedList);

//7. Write a Java program to insert the specified element at the front of a linked list.
        System.out.println();
//8. Write a Java program to insert the specified element at the end of a linked list.

//9. Write a Java program to insert some elements at the specified position into a linked list.

//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
        System.out.println(stringLinkedList.getFirst());
        System.out.println(stringLinkedList.getLast());

//11. Write a Java program to display elements and their positions in a linked list.



//12. Write a Java program to remove a specified element from a linked list.
        stringLinkedList.remove("Voilet");
        System.out.println(stringLinkedList);

//13. Write a Java program to remove the first and last elements from a linked list.
        System.out.println("13. Write a Java program to remove the first and last elements from a linked list.");
        stringLinkedList.pollFirst();
        stringLinkedList.pollLast();
        System.out.println(stringLinkedList);
//14. Write a Java program to remove all elements from a linked list.
//    Click me to see the solution
//
//15. Write a Java program that swaps two elements in a linked list.
//    Click me to see the solution
//
//16. Write a Java program to shuffle elements in a linked list.
//    Click me to see the solution
//
//17. Write a Java program to join two linked lists.
//    Click me to see the solution
//
//18. Write a Java program to copy a linked list to another linked list.
//    Click me to see the solution
//
//19. Write a Java program to remove and return the first element of a linked list.
//    Click me to see the solution
//
//20. Write a Java program to retrieve, but not remove, the first element of a linked list.
//    Click me to see the solution
//
//21. Write a Java program to retrieve, but not remove, the last element of a linked list.
//    Click me to see the solution
//
//22. Write a Java program to check if a particular element exists in a linked list.
//    Click me to see the solution
//
//23. Write a Java program to convert a linked list to an array list.
//    Click me to see the solution
//
//24. Write a Java program to compare two linked lists.
//    Click me to see the solution
//
//25. Write a Java program to check if a linked list is empty or not.
//    Click me to see the solution
//
//26. Write a Java program to replace an element in a linked list.
    }
}
