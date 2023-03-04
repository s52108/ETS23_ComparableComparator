import java.util.Arrays;

public class StudentDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 6, 3, 8, 12};

        String[] names = {"Philipp", "Jürgen", "Arnold", "Maxim"};
        Student fitim = new Student(1234567, "Fitim", "Ismani");
        Student daniel = new Student(7654321, "Daniel", "Sattler");
        Student adolf = new Student(5641236, "Adolf Simon", "Postl");
        Student[] students = new Student[]{fitim, daniel, adolf};

        System.out.println("vor der Sortierung: " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("nach der Sortierung: " + Arrays.toString(students));

    }
}
