package collection_examples.sorting_example;
//import l
import java.util.List;
public class Student implements Comparable<Student>{
    Integer id;
    String name;
    List<Subject> subjectList;

    @Override
    public int compareTo(Student o) {
//        return o.id > this.id ? 1:-1;
            return id.compareTo(o.id);
    }

    public Student(int id, String name, List<Subject> subjectList) {
//        if ()
        this.id = id;
        this.name = name;
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
