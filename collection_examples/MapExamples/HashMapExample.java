package collection_examples.MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {


//    1. Write a Java program to associate the specified value with the specified key in a HashMap.

        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(10, "yellow");
        hash_map.put(2, "Green");
        hash_map.put(1, "Red");
        hash_map.put(3, "blue");

        System.out.println("Hash Map : " + hash_map);

//2. Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println("Hash Map Size : " + hash_map.size());

//3. Write a Java program to copy all mappings from the specified map to another map.

        HashMap<Integer, String> hash_map_copy = new HashMap<>(hash_map);
        System.out.println("Hash Map Copy : " + hash_map_copy);

        for (Map.Entry entry : hash_map_copy.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//4. Write a Java program to remove all mappings from a map.

        hash_map_copy.clear();
        System.out.println("Hash Map Copy : " + hash_map_copy);

//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("Is Hash Map Copy empty : " + hash_map_copy.isEmpty());

//6. Write a Java program to get a shallow copy of a HashMap instance.

        var newHashMap = (HashMap) hash_map.clone();
        System.out.println("New Hash Map : " + newHashMap);
//7. Write a Java program to test if a map contains a mapping for the specified key.

        System.out.println("New Hash Map contains 10 Key : " + newHashMap.containsKey(10));

//8. Write a Java program to test if a map contains a mapping for the specified value.

        System.out.println("New Hash Map contains Green value : " + newHashMap.containsValue("Green"));

//9. Write a Java program to create a set view of the mappings contained in a map.

        Set set = hash_map.entrySet();
        System.out.println("Set : " + set);
//10. Write a Java program to get the value of a specified key in a map.

        System.out.println("Element at 10 : "+ hash_map.get(10));
//11. Write a Java program to get a set view of the keys contained in this map.

        Set keySet = hash_map.keySet();
        System.out.println("Key Set : "+keySet);
//12. Write a Java program to get a collection view of the values contained in this map.

        var valueSet = hash_map.values();
        System.out.println("Value Set : "+valueSet);
    }
}
