package CapgeminiJavaAssignment8Lambda;

import java.util.ArrayList;
import java.util.List;

public class OddLength {
    public static void main(String[] args) {
        List<String> Names=new ArrayList<>();
        Names.add("Max");
        Names.add("Alonso");
        Names.add("Sergio");
        Names.add("Kimi");
        Names.add("Lewis");

        Names.removeIf(s ->(s.length())%2!=0);

        for (String n : Names) {
            System.out.println(n);
        }

    }
}
