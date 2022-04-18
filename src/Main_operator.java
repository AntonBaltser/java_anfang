import java.util.Scanner;

public class Main_operator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51; // first == 31 ? 3 : 34

        if (first >= second && isTrue) { // '==', '<'
            System.out.print("Num is 10");
            System.out.print("\n");
        }
        else if(first == 45)
            System.out.print("Num is equal 45");
        else {
            System.out.print("Num is lower than " + second);
        }
        switch (first) {
            case 144:
                System.out.print("Num is equal 45");
                break;
            default:
                System.out.print("Num is equal something");
        }
    }
}
