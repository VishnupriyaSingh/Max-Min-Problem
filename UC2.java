public class UC2 {
    public static Float findMax(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(3.3f, 2.2f, 1.1f).equals(3.3f));
        System.out.println(findMax(2.2f, 3.3f, 1.1f).equals(3.3f));
        System.out.println(findMax(1.1f, 2.2f, 3.3f).equals(3.3f));
    }
}