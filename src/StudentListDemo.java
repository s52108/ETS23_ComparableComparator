import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(123456, "Daniel", "Sattler"));
        students.add(new Student(654321, "Adolf Simon", "Postl"));
        students.add(new Student(456123, "Mario", "Stöffler"));

        Collections.sort(students, new StudentLastNameComparator());
    }

}
