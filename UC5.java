import java.util.Arrays;

public class UC5<T extends Comparable<T>> {
    T[] values;

    @SafeVarargs
    public UC5(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        return findMax(values);
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T findMax(T... values) {
        T max = Arrays.stream(values).max(Comparable::compareTo).orElse(null);
        printMax(max);
        return max;
    }

    public static <T> void printMax(T max) {
        if (max != null) {
            System.out.println("Maximum: " + max);
        }
    }

    public static void main(String[] args) {
        UC5.findMax(1, 2, 3, 4, 5, 6);
        UC5.findMax(3.3f, 2.2f, 1.1f, 4.4f, 5.5f);
        UC5.findMax("Apple", "Peach", "Banana", "Mango", "Orange");
    }
}