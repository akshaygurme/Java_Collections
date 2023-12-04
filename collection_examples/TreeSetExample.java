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

        TreeSet<Integer> integersTreeSet = new TreeSet<>();
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

        TreeSet<String> stringSet2 = new TreeSet<>();
        stringSet2= (TreeSet<String>)  stringSet.clone();
        System.out.println("String Set 2 : "+stringSet2);

//        7. Write a Java program to get the number of elements in a tree set.

        System.out.println("IntegersTreeSet : "+integersTreeSet);
        System.out.println("Size of IntegersTreeSet : "+integersTreeSet.size());
//        8. Write a Java program to compare two tree sets.



//        9. Write a Java program to find numbers less than 7 in a tree set.

        integersTreeSet.add(20);
        integersTreeSet.add(50);
        integersTreeSet.add(80);
        integersTreeSet.add(200);

        TreeSet<Integer> treeHeadSet =new TreeSet();
        treeHeadSet = (TreeSet) integersTreeSet.headSet(46);

        System.out.println("Tree Head Set : "+treeHeadSet);


//        10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.

        treeHeadSet=(TreeSet<Integer>) integersTreeSet.tailSet(46);
        System.out.println("Tree Head Set : "+treeHeadSet);

//        11. Write a Java program to get the element in a tree set less than or equal to the given element.


        System.out.println("Number less than or equal to 40 : "+integersTreeSet.floor(40));

//        12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.

        System.out.println("Number greater than orequal to 40 : "+integersTreeSet.ceiling(40));

//        13. Write a Java program to get an element in a tree set that has a lower value than the given element.


//        14. Write a Java program to retrieve and remove the first element of a tree set.


//        15. Write a Java program to retrieve and remove the last element of a tree set.


//        16. Write a Java program to remove a given element from a tree set.
        treeHeadSet.remove(50);
        System.out.println("Tree Head Set : "+treeHeadSet);
    }
}
