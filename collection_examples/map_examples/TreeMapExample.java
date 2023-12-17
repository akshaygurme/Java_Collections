package collection_examples.map_examples;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
//        1. Write a Java program to associate the specified value with the specified key in a Tree Map.

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10,"Red");
        treeMap.put(40,"Green");
        treeMap.put(20,"Red");
        treeMap.put(30,"Red");
        treeMap.put(70,"Red");
        treeMap.put(80,"Green");
        System.out.println("Tree Map : "+ treeMap);
//        2. Write a Java program to copy Tree Map's content to another Tree Map.

        TreeMap<Integer,String> treeMap1 = new TreeMap<>();
        treeMap1.putAll(treeMap);

        System.out.println("Tree Map 1 : "+ treeMap1);
//        3. Write a Java program to search for a key in a Tree Map.

        System.out.println("Key: 20 present in treeMap : "+treeMap1.containsKey(20));

//        4. Write a Java program to search for a value in a Tree Map.

        System.out.println("Value : Red present in treeMap : "+treeMap1.containsValue("Red"));

//        5. Write a Java program to get all keys from a Tree Map.

       var res = treeMap1.keySet();
        System.out.println(res);

//        6. Write a Java program to delete all elements from a Tree Map.


//        7. Write a Java program to sort keys in a Tree Map by using a comparator.

//        treeMap1.comparator().compare();
//        8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
//                Click me to see the solution
//
//        9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
//                Click me to see the solution
//
//        10. Write a Java program to get a reverse order view of the keys contained in a given map.
//        Click me to see the solution
//
//        11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
//        Click me to see the solution
//
//        12. Write a Java program to get the greatest key less than or equal to the given key.
//                Click me to see the solution
//
//        13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
//        Click me to see the solution
//
//        14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
//                Click me to see the solution
//
//        15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
//                Click me to see the solution
//
//        16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
//                Click me to see the solution
//
//        17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
//                Click me to see the solution
//
//        18. Write a Java program to get a NavigableSet view of keys in a map.
//        Click me to see the solution
//
//        19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
//                Click me to see the solution
//
//        20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
//                Click me to see the solution
//
//        21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
//                Click me to see the solution
//
//        22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
//                Click me to see the solution
//
//        23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
//        Click me to see the solution
//
//        24. Write a Java program to get a portion of a map whose keys are greater than a given key.
//                Click me to see the solution
//
//        25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
//                Click me to see the solution
//
//        26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    }
}
