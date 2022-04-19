public class Main_cycle {
    public static void main(String[] args){
        for (int i = 100; i >= 10; i -= 10)
            System.out.println(i);

        boolean isTrue = true;
        int k = 0;
        while ( isTrue) {
            k++;
            if( k % 2 == 0 )
                continue;
            System.out.print(k + " ");
            if( k > 10) {
                isTrue = false; // break; return;
                System.out.println();
            }
        }

        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while ( x < 0);
    }
}
