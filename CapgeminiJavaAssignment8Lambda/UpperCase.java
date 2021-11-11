package CapgeminiJavaAssignment8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class MyOperator implements UnaryOperator<String> {
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}

public class UpperCase {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("max");
        li.add("sergio");
        li.add("lewis");
        li.add("bottas");
        System.out.println("Elements in list are:");
        System.out.println(li);
        System.out.println();

        li.replaceAll(new MyOperator());
        System.out.println("Elements in list after replacing with upper case letters are:");
        System.out.println(li);
    }

}

