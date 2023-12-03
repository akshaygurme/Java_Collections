package collection_examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.

        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("Black");
        stringSet.add("Red");
        stringSet.add("White");
        stringSet.add("Green");

        System.out.println("String Tree Set : "+stringSet);

//        2. Write a Java program to iterate through all elements in a tree set.

        Iterator<String> it = stringSet.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

//        3. Write a Java program to add all the elements of a specified tree set to another tree set.

        Set<Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(54);
        integerHashSet.add(23);
        integerHashSet.add(45);
        integerHashSet.add(11);

        Set<Integer> integersTreeSet = new TreeSet<>();
        integersTreeSet.addAll(integerHashSet);
        System.out.println("Integer Hash Set : " + integerHashSet);
        System.out.println("Integer Tree Set : " + integersTreeSet);

//        4. Write a Java program to create a reverse order view of the elements contained in a given tree set.


//        Iterator it = stringSet.descendingI
        Iterator it1 = stringSet.descendingIterator();
        System.out.println("String Set : "+stringSet);

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

//        5. Write a Java program to get the first and last elements in a tree set.

        System.out.println("Last element : "+stringSet.last());
        System.out.println("First element : "+stringSet.first());

//        6. Write a Java program to clone a tree set list to another tree set.


//        7. Write a Java program to get the number of elements in a tree set.
//        Click me to see the solution
//
//        8. Write a Java program to compare two tree sets.
//                Click me to see the solution
//
//        9. Write a Java program to find numbers less than 7 in a tree set.
//        Click me to see the solution
//
//        10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
//        Click me to see the solution
//
//        11. Write a Java program to get the element in a tree set less than or equal to the given element.
//        Click me to see the solution
//
//        12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
//                Click me to see the solution
//
//        13. Write a Java program to get an element in a tree set that has a lower value than the given element.
//                Click me to see the solution
//
//        14. Write a Java program to retrieve and remove the first element of a tree set.
//                Click me to see the solution
//
//        15. Write a Java program to retrieve and remove the last element of a tree set.
//                Click me to see the solution
//
//        16. Write a Java program to remove a given element from a tree set.
    }
}
