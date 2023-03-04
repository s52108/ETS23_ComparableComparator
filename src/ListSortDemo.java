import java.util.ArrayList;
import java.util.Collections;

public class ListSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList();
        integers.add(5);
        integers.add(1);
        integers.add(6);
        integers.add(3);
        integers.add(2);
        integers.add(5);
        integers.add(4);

        Collections.sort(integers);
        System.out.println(integers);

        ArrayList<Highscore> highscores = new ArrayList<>();
        highscores.add(new Highscore("max", 230));
        highscores.add(new Highscore("susi", 188));
        highscores.add(new Highscore("john", 190));

        Collections.sort(highscores);
        System.out.println(highscores);
    }
}
