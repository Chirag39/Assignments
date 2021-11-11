package CapgeminiJavaAssignment8Lambda;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> Names=new ArrayList<>();
        Names.add("Max");
        Names.add("Alonso");
        Names.add("Sergio");
        Names.add("Kimi");

        StringBuilder result=new StringBuilder();
        Names.forEach(s ->result.append(s.charAt(0)));
        System.out.println(result);
    }
}

