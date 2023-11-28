public class Refactor1 {
    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(3, 2, 1).equals(3));

        System.out.println(findMax(3.3f, 2.2f, 1.1f).equals(3.3f));

        System.out.println(findMax("Apple", "Peach", "Banana").equals("Peach"));
    }
}