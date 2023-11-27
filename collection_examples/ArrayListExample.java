package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


public class ArrayListExample {
    private static final Logger log = Logger.getLogger(ArrayListExample.class.getName());

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        log.info("Array List : " + arrayList);
        log.info(arrayList.get(1).toString());

        for (int i = 0; i < 2; i++) {
            log.info("For Loop : " + arrayList.get(i));
        }

        for (Object number : arrayList) {
            log.info("For Each Loop : " + number);
        }

        // Add element in first position
        arrayList.add(0, 12);
        System.out.println(arrayList);

//        Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(arrayList.get(2));

//        Write a Java program to update an array element by the given element.
        arrayList.set(1, 100);
        System.out.println(arrayList.get(1));

//        Write a Java program to remove the third element from an array list.
        arrayList.remove(2);
        System.out.println(arrayList);

//         Write a Java program to search for an element in an array list.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Yellow");
        System.out.println("Green present in list : " + stringList.contains("Green"));

//        Write a Java program to sort a given array list.
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(1);
        numberList.add(3);
        numberList.add(15);

        System.out.println("Unsorted Array List : " + numberList);
        Collections.sort(numberList);
        System.out.println("Sorted Array List : " + numberList);

//        Write a Java program to copy one array list into another.
        arrayList.add(13);
        arrayList.add(2);
        System.out.println("Array List : " + arrayList);
        System.out.println("Number List : " + numberList);
        try {
            Collections.copy(arrayList, numberList);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Number List copied to Array List" + arrayList);

//        Write a Java program to shuffle elements in an array list.
        Collections.shuffle(arrayList);
        System.out.println("Array List Shuffled : " + arrayList);
//        Write a Java program to reverse elements in an array list.

        System.out.println("String List : " + stringList);
        Collections.reverse(stringList);
        System.out.println("Reversed List : " + stringList);
//        Write a Java program to extract a portion of an array list.
        try {
            System.out.println(arrayList.subList(1, 4));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ArrayList Size : " + arrayList.size());
//        Write a Java program to compare two array lists.
        ArrayList<String> result = new ArrayList<>();
        numberList.add(14);
        for (Integer number : numberList) {
            if (arrayList.contains(number)) {
                result.add("yes");
            } else {
                result.add("no");
            }
        }
        System.out.println("Number List : " + numberList);
        System.out.println("Array List : " + arrayList);
        System.out.println("Result List : " + result);

//        Write a Java program that swaps two elements in an array list.
        Collections.swap(numberList, 3, 2);
        System.out.println("Number List : " + numberList);

//        Write a Java program to join two array lists.
        ArrayList<Integer> addAll = new ArrayList<>();
        addAll.addAll(arrayList);
        addAll.addAll(numberList);
        System.out.println("Add All List : " + addAll);


//        Write a Java program to clone an array list to another array list.

//        Write a Java program to empty an array list.
        arrayList.removeAll(arrayList);

//        Write a Java program to test whether an array list is empty or not.
        System.out.println("Array List is Empty : " + arrayList.isEmpty());
//        Write a Java program for trimming the capacity of an array list.

//        Write a Java program to increase an array list size.

//        Write a Java program to replace the second element of an ArrayList with the specified element.

//        Write a Java program to print all the elements of an ArrayList using the elements' position.

    }
}
