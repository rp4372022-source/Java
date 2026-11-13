package stream_api;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    Student(String name){this.name = name;}
    public String toString(){return name;}
}
public class ConstructorRefrence {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
            List.of("Rutik","Apurv","Tanmay","Manas","Jidnesh")
        );
        // normal way
        List<Student> students = names.stream()
            .map(n -> new Student(n))
            .toList();
        students.forEach(n -> System.out.println(n));
            // constructor refrence
        List<Student> students2 = names.stream()
            .map(Student::new)
            .toList();

        students2.forEach(System.out::println);
    }
}
