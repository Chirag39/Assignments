package CapgeminiJavaAssignment8Lambda;

import java.util.ArrayList;
import java.util.List;

public class NumberThread {
    public static void main(String[] args) {
        List<Integer> Numbers=new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);

        Thread t1=new Thread(()-> Numbers.forEach(i -> System.out.println(i)));
        t1.start();
    }
}
