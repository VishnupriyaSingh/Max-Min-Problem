public class UC3 {
    public static String findMax(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax("Apple", "Peach", "Banana").equals("Peach"));
        System.out.println(findMax("Banana", "Peach", "Apple").equals("Peach"));
        System.out.println(findMax("Banana", "Apple", "Peach").equals("Peach"));
    }
}