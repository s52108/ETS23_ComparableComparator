import java.util.Objects;

public class Apple implements Comparable<Apple> {

    private String color;
    private int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Apple apple) {
        //1. Möglichkeit: Sortierung via color
        //return this.color.compareTo(apple.color);

        //2. Möglichkeit: Sortierung via weight
        return Integer.compare(this.weight,apple.weight);
    }}