public class Main_multi_arrays {
    public static void main (String[] args) {
        char[][] array = new char[3][3];
//        for (int i = 0; i < array.length; i++) для выделения памяти, но в последних обновлениях не обзательно
//            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.print(array[0][0]);
    }
}
