import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(123456, "Adolf Simon", "Postl"));
        students.add(new Student(654321, "Daniel", "Sattler"));
        students.add(new Student(456123, "Max", "Postl"));


        //Collections.sort(students, new StudentLastFirstNameComparator());
        students.sort(new StudentLastNameComparator());
        System.out.println(students);

        //sortieren nach Nachnamen absteigend
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student other) {
                return other.getLastName().compareTo(student.getLastName());
            }
        });

        System.out.println(students);

        //sortieren nach nachnamen aufsteigend
        //wir verwenden lambda expressions

        students.sort(
                (Student student, Student other) -> student.getLastName().compareTo(other.getLastName()));


        //sortieren nach Vornamen aufsteigend
        //Method Reference

        students.sort(Comparator.comparing(Student::getFirstName));

        //sortieren nach Nachnamen aufsteigend
        //Method Reference

        students.sort(Comparator.comparing(Student::getLastName)
                .thenComparing(Student::getFirstName));

        students.sort(Comparator.comparing(Student::getLastName)
                .thenComparing(
                        (student, other) ->
                                other.getFirstName().compareTo(student.getFirstName())));

    }
}
