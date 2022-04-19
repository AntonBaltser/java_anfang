package reloading_methods;

public class Main {
   public static int summ ( int a, int b) {
        return a + b;
    }
    public static int summ ( int a, int b, int g) {
        return a + b + g;
    }
    public static float summ ( float a, float b, float g) {
        return a + b + g;
    }
    public static void main(String[] args) {
        System.out.println(summ(14, 10));
        System.out.println(summ(14, 10, 2));
        System.out.println(summ(14.32f, 10.3f, 2.23f));
    }
}
