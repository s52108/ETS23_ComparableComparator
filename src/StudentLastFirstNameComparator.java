import java.util.Comparator;

public class StudentLastFirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        int result = student.getLastName().compareTo(t1.getLastName());
        if (result == 0) {
            result = t1.getFirstName().compareTo(student.getFirstName());
        }
        return result;

    }
}
