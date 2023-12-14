package collection_examples.sorting_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingCollection {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        ArrayList<Integer> array = new ArrayList<>();
        array.add(16);
        array.add(35);
        array.add(54);
        array.add(73);
        array.add(42);
        array.add(21);

        System.out.println("Before Sorting Array : "+array);
        Collections.sort(array);
        System.out.println("After Sorting Array : "+array);
        Collections.sort(array,comparator);
        System.out.println("After Mod Sorting Array : "+array);

        System.out.println("-------------------------------------------------------------");

//        Comparator<String> stringComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                if (o1.length()>o2.length()) {
////                    return 1;
////                }
////                else {
////                    return -1;
////                }
//                return  o1.length()>o2.length()?1:-1;
//            }
//        };
        Comparator<String> stringComparator = (i,j) -> i.length()>j.length()?1:-1;

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("one");
        stringArray.add("two");
        stringArray.add("three");
        stringArray.add("four");
        stringArray.add("five");
        stringArray.add("six");

        System.out.println("Original : "+stringArray);
        Collections.sort(stringArray);
        System.out.println("Sorted : "+stringArray);
        Collections.sort(stringArray,stringComparator);
        System.out.println("Comparator : "+stringArray);

//        Collections.sort(array,Comparator.comparing( o1 > o2 ? 1 : -1));
    }
}
