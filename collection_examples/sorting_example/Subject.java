package collection_examples.sorting_example;

public class Subject {
    String name;
    int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
