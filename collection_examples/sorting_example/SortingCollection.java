package collection_examples.sorting_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollection {
    public static void main1(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else {
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

        System.out.println("Before Sorting Array : " + array);
        Collections.sort(array);
        System.out.println("After Sorting Array : " + array);
        Collections.sort(array, comparator);
        System.out.println("After Mod Sorting Array : " + array);

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
        Comparator<String> stringComparator = (i, j) -> i.length() > j.length() ? 1 : -1;

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("one");
        stringArray.add("two");
        stringArray.add("three");
        stringArray.add("four");
        stringArray.add("five");
        stringArray.add("six");

        System.out.println("Original : " + stringArray);
        Collections.sort(stringArray);
        System.out.println("Sorted : " + stringArray);
        Collections.sort(stringArray, stringComparator);
        System.out.println("Comparator : " + stringArray);

//        Collections.sort(array,Comparator.comparing( o1 > o2 ? 1 : -1));

//---------------------------------------------------------------------------------------------------------

//        Define Object


        Subject maths = new Subject("Maths", 99);
        Subject science = new Subject("Science", 95);
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(maths);
        subjectList.add(science);
        List<Student> studentList = new ArrayList<>();
        Student akshay = new Student(1, "Akshay", subjectList);
        studentList.add(akshay);

        maths = new Subject("Maths", 92);
        science = new Subject("Science", 60);
        subjectList = new ArrayList<>();
        subjectList.add(maths);
        subjectList.add(science);
        Student tanuj = new Student(3, "Tanuj", subjectList);
        studentList.add(tanuj);

        maths = new Subject("Maths", 93);
        science = new Subject("Science", 99);
        subjectList = new ArrayList<>();
        subjectList.add(maths);
        subjectList.add(science);
        Student apurva = new Student(2, "Apurva", subjectList);
        studentList.add(apurva);

        apurva.subjectList.get(0);

//---------------------------------------------------------------------------------------------------------

//        Sort above Student list

        Comparator<Student> studentComparator = (o1, o2) -> {
            if (o1.id > o2.id) {
                return 1;
            } else {
                return -1;
            }
        };

        studentList.sort(studentComparator);

//---------------------------------------------------------------------------------------------------------

//        Sort above Student list with science marks

        Comparator<Student> scienceComparator = (o1, o2) -> {
            if (o1.subjectList.get(1).marks > o2.subjectList.get(1).marks) {
                return 1;
            } else {
                return -1;
            }
        };

        studentList.sort(scienceComparator);

//---------------------------------------------------------------------------------------------------------

//        Sort above Student list with inline function
//

        studentList.sort(((o1, o2) -> o1.subjectList.get(0).marks > o2.subjectList.get(0).marks ? 1 : -1));

//---------------------------------------------------------------------------------------------------------

//        Sort above Student list with thenCompare()
//

        studentList.sort(Comparator.comparing(o-> o.id));
        System.out.println("hello");
    }

    public static void main(String[] args) {
        //Comparable example

        Subject maths = new Subject("Maths", 99);
        Subject science = new Subject("Science", 95);
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(maths);
        subjectList.add(science);
        List<Student> studentList = new ArrayList<>();
        Student akshay = new Student(1, "Akshay", subjectList);
        studentList.add(akshay);

        maths = new Subject("Maths", 92);
        science = new Subject("Science", 60);
        subjectList = new ArrayList<>();
        subjectList.add(maths);
        subjectList.add(science);
        Student tanuj = new Student(3, "Tanuj", subjectList);
        studentList.add(tanuj);

        maths = new Subject("Maths", 93);
        science = new Subject("Science", 99);
        subjectList = new ArrayList<>();
        subjectList.add(maths);
        subjectList.add(science);
        Student apurva = new Student(2, "Apurva", subjectList);
        studentList.add(apurva);

//        apurva.subjectList.get(0);

        System.out.println("Student List : "+studentList);
        Collections.sort(studentList);
        System.out.println("Sorted Student on Id : "+studentList);

//        ------------------------------------------------------------------------------------------

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               return o1.id<o2.id?1:-1;
            }
        };

        studentList.stream().sorted(comparator).forEach(System.out::println);
    }
}
