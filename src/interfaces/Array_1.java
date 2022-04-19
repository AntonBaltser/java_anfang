package interfaces;

public class Array_1 implements Array {
    int a[] = new int[3];
    int size = 0;

    @Override // ключевое слово, говорит что переписывам метод и его реализуем
    public  int Get(int i) {
        if(i < a.length)
            return a[a.length - i - 1];
        else
            return a[0];
    }
    @Override
    public boolean Add (int val) {
        if (size !=  a.length){
            a[size] = val;
            size++;
            return true;
        } else
            return false;
    }
}
