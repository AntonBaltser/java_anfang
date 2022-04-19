package final_static;

public class Main {   //если перед class поставить final -- это будет значить, что у этого класса не может быть наследников

    public static void main(String[] args) {   //если после public поставить final, нельзя будет переопределить фунцию в других классах
//        final int a = 10;  final - это константа
//        a = 1;

        int x = Math.summ(12, 22);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        a.x = 35;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);
    }
}
