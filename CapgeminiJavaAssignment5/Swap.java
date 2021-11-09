package CageminiJavaAssignment5;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        Integer [] a = {11,42,36,45,95,69,27,88};
        System.out.println("Before swap, array: "+Arrays.toString(a));

        swap(a, 0, 1);      //object, index1, index2
        System.out.println(" After swap, array: "+ Arrays.toString(a));
    }

    public static <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
