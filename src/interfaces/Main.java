package interfaces;

public class Main {
    public static void main (String[] args) {
        Array a = new MyArray();
        System.out.println(a.Add(4));
        System.out.println(a.Add(23));
        System.out.println(a.Add(12));
        System.out.println(a.Add(41));
        System.out.println(a.Get(2));
        System.out.println("");

        Array b = new Array_1();
        System.out.println(b.Add(4));
        System.out.println(b.Add(23));
        System.out.println(b.Add(12));
        System.out.println(b.Add(41));
        System.out.println(b.Get(2));
    }
}
