import java.util.Scanner;

public class Main_function  {
    public static void main (String[] args){
        int temp = func (3, 4);
        System.out.println(temp);
        readArray();
    }
    public static int[]readArray () {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = in.nextInt();
        arr = new int[n];
                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter the contents of cell number " + i  + ": ");
                    arr[i - 1] = in.nextInt();
                }
                return arr;
    }
    public static int func (int a, int b) {
        int result = 1;
        for ( int i = 0; i < b; i++)
            result *= a;
        return result;
    }
}
