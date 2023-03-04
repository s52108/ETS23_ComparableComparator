import java.util.Arrays;

public class HighscoreDemo {
    public static void main(String[] args) {
        Highscore[] highscores = {
                new Highscore("max", 130),
                new Highscore("john", 250),
                new Highscore("susi", 200),
        };

        System.out.println("vor der Sortierung: " + Arrays.toString(highscores));
        Arrays.sort(highscores);
        System.out.println("nach der Sortierung: " + Arrays.toString(highscores));
    }
}
