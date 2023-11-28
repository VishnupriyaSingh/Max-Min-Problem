public class Refactor2<T extends Comparable<T>> {
    T x, y, z;

    // Constructor
    public Refactor2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to test the maximum of the instance variables
    public T testMaximum() {
        return Refactor2.findMax(x, y, z);
    }

    // Static method to find the maximum of three comparable objects
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
        Refactor2<Integer> testInt = new Refactor2<>(3, 2, 1);
        System.out.println(testInt.testMaximum().equals(3));

        Refactor2<Float> testFloat = new Refactor2<>(3.3f, 2.2f, 1.1f);
        System.out.println(testFloat.testMaximum().equals(3.3f));

        Refactor2<String> testString = new Refactor2<>("Apple", "Peach", "Banana");
        System.out.println(testString.testMaximum().equals("Peach"));
    }
}