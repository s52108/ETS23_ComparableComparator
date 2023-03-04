import java.util.Arrays;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
               new Employee(123455,"Adi Postl",10000,"R&D"),
               new Employee(554321,"Daniel Sattler",15000,"IT Security"),
               new Employee(987654,"Markus Stoff",12500,"Softwareentwicklung"),
        };

        System.out.println("vor der Sortierung: " + Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("nach der Sortierung: " + Arrays.toString(employees));


    }
}
