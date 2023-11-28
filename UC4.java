import java.util.Arrays;

public class UC4<T extends Comparable<T>> {
    T[] values;

    @SafeVarargs
    public UC4(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        return findMax(values);
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T findMax(T... values) {
        return Arrays.stream(values).max(Comparable::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(UC4.findMax(1, 2, 3, 4, 5, 6).equals(6));
        System.out.println(UC4.findMax(3.3f, 2.2f, 1.1f, 4.4f, 5.5f).equals(5.5f));
        System.out.println(UC4.findMax("Apple", "Peach", "Banana", "Mango", "Orange").equals("Peach"));
    }
}