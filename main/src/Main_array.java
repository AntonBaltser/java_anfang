import java.util.Scanner;

public class Main_array {
    public static void main (String[] args){
        float[] arrFloat = new float[] {43.3f , 23.32f, 24.1f, 22.2f, 43};
        System.out.println(arrFloat[2]);

        int[] arrInt;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        arrInt = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter a[" + i + "] = ");
            arrInt[i] = in.nextInt();
        }
    }
}
