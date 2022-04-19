import java.util.Scanner;

public class Main_mathematic {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result; //при использовании int, при делении может быть ошибка, если результат будет с точкой.
        System.out.print("Enter first num ");
        first = num.nextFloat();
        System.out.print("Enter second num ");
        second = num.nextFloat();
        result = first + second;  // также "-", "/", "*", "%"(остаток при делении)
        result /= 2; // сокращиние: result = result / 2; или "++", "+=", "*=", "--"
        System.out.println("Result is = " + result);
    }
}


