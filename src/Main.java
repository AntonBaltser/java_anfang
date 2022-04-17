import java.lang.String;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world! ");
        System.out.println("Hello world!");
    
        byte num = 25; //переменная для маленьких размеров памяти(числа) 8 bit (1B) (от -128 до 127)
        short num_1 = 32767;  // числа 16 bit (2B)(от -32,768 до 32,767 или -32768 до 32767)
        int num_2 = 922337203; // числа от -2^31 до 2^31-1 (32 bit (4B)) или  -2147483648 до 2147483647
        long num_3 = 9223372036854775807L;  //от -2^63 до 2^63-1 (8B) или -9223372036854775808 до 9223372036854775807 обычно очень редко используется, в понце числа добавлятеся "L"
        float num_4 = 26.23f; //числа от -3.4*10^38 до 3.4*10^38 с плавающей точкой (4B) добавляется "f"
        double num_5 = 843.54343543; //число с плавающей точкой от ±4.9*10^-324 до ±1.8*10^308 (8B)
        boolean isTrue = false; //Логические или  булевы значения возможных значений: true или false.
        char sym = 'y'; // переменная символьного, одиночный символ, заключенный в одинарные кавычки: char ch='e';. Кроме того,  также можно присвоить целочисленное значение от 0 до 65535. В этом случае переменная опять же будет хранить символ, а целочисленное значение будет указывать на номер символа в таблице символов Unicode (UTF-16).
        String str = "Hallo Welt!";//Символьные переменные не стоит путать со строковыми, 'a' не идентично "a". Строковые переменные представляют объект String, который в отличие от char или int не является примитивным типом в Java
        System.out.println(str);
    }
}
