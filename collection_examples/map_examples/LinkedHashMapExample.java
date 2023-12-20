package collection_examples.map_examples;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Akshay");
        linkedHashMap.put(5,"Akshay");
        linkedHashMap.put(2,"Apurva");
        linkedHashMap.put(4,"Akshay");
        linkedHashMap.put(3,"Akshay");

        System.out.println("Linked Hash Map : "+linkedHashMap);

        Comparator<Map.Entry> comparator = new Comparator<Map.Entry>(){
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                if(o1.getKey().equals(o2.getKey()))
                    return 1;
                else return -1;

            }
        };

//        Collections.sort(linkedHashMap, Comparator.comparing(comparator));
        TreeMap<Integer, String> sortedLinkedHashMap = new TreeMap<>(linkedHashMap);
        System.out.println("Sorted Linked Hash Map : "+sortedLinkedHashMap);
    }
}
