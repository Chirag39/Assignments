package Java11Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQ3 {
    public static void main(String[] args) {
        String s="A quick brown fox jumps over the lazy dog";

        String[] strSplit = s.split(" ");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(strSplit));

//        String[] arr=words.toArray(new String[0]);
        String[] arr=words.toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
