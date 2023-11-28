public class TestMaximum {
    public static Integer findMax(Integer x, Integer y, Integer z) {
        Integer max = x;
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

        System.out.println(findMax(2, 3, 1).equals(3));

        System.out.println(findMax(1, 2, 3).equals(3));
    }
}