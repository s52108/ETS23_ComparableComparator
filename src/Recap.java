import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recap {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 6, 3, 8, 1};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        ArrayList<String> names = new ArrayList<>();
        names.add("max");
        names.add("susi");
        names.add("john");

        Collections.sort(names);

        System.out.println(names);

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 20));
        apples.add(new Apple("green", 15));
        apples.add(new Apple("yellow", 35));

        Collections.sort(apples);
        System.out.println(apples);

    }
}
