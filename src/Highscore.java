import java.util.Objects;

public class Highscore implements Comparable<Highscore> {
    private String name;
    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Highscore)) return false;
        Highscore highscore = (Highscore) o;
        return score == highscore.score && Objects.equals(name, highscore.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Highscore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Highscore{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Highscore other) {
        if (this.score < other.score) {
            return -1;
        }
        if (this.score > other.score) {
            return 1;
        }
        return 0;

        //Sortierung nach Name aufsteigend
        //return this.name.compareTo(other.name);
    }
}
