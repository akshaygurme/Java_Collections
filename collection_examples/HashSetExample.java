package collection_examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
//        1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(200);
        System.out.println("Hash Set : "+hashSet);

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(45);
        arrayList.add(10);
        System.out.println("ArrayList : "+arrayList);

        hashSet.addAll(arrayList);
        System.out.println("Hash Set + Array List : "+hashSet);

        hashSet.add(30);
        System.out.println("Hash Set : "+hashSet);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Red");
        stringArrayList.add("Green");
        stringArrayList.add("Blue");
        stringArrayList.add("Yellow");
        stringArrayList.add("Black");

        System.out.println("String Array List : "+ stringArrayList);

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.addAll(stringArrayList);

        System.out.println("String Hash Set : "+stringHashSet);


//        2. Write a Java program to iterate through all elements in a hash list.
        for(Integer number : hashSet)
        {
            System.out.println("number : "+number);
        }


//        3. Write a Java program to get the number of elements in a hash set.
        System.out.println("Hash Set SIze : "+hashSet.size());



//        4. Write a Java program to empty an hash set.
        hashSet.removeAll(hashSet);

        System.out.println("Hash set empty : "+hashSet);


//        5. Write a Java program to test if a hash set is empty or not.

        if(hashSet.isEmpty())
        {
            System.out.println("Hash Set is empty");
        }
//        6. Write a Java program to clone a hash set to another hash set.

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1 =(HashSet<String>)stringHashSet.clone();
        System.out.println("Cloned hashset "+ hashSet1);

//        7. Write a Java program to convert a hash set to an array.

        ArrayList<String> hashArrayList = new ArrayList();
        hashArrayList.addAll(hashSet1);
        System.out.println(hashArrayList);

//        8. Write a Java program to convert a hash set to a tree set.

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.addAll(hashSet1);
        System.out.println("Tree Set : "+treeSet);
//        9. Write a Java program to find numbers less than 7 in a tree set.
        
//        10. Write a Java program to compare two hash set.


//        11. Write a Java program to compare two sets and retain elements that are the same.
        Set<Integer> setEg1 = new HashSet();
        setEg1.add(10);
        setEg1.add(30);
        setEg1.add(80);
        System.out.println("Set1 : "+setEg1);

        Set<Integer> setEg2 = new HashSet();
        setEg2.add(10);
        setEg2.add(30);
        setEg2.add(80);
        setEg2.add(90);
        System.out.println("Set2 : "+setEg2);


        for(Integer number:setEg2)
        {
            if(setEg1.contains(number)){
                System.out.println("Set Eg 1 Contains " + number);
            }
        }
//        12. Write a Java program to remove all elements from a hash set.

        Set<Integer> setEg = new HashSet();
        setEg.add(10);
        setEg.add(30);
        setEg.add(80);
        System.out.println("Set : "+setEg);

        setEg.clear();
        System.out.println("Set : "+setEg);
    }
}
