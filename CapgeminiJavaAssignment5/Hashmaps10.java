package CapgeminiJavaAssignment5;

import java.util.HashMap;

public class Hashmaps10 {
    public static void main(String[] args) {
        HashMap<Integer, Double> map = new HashMap<>();

        do {
            int keys = (int) Math.floor((Math.random() * 10) + 1);
            double values = Math.floor((Math.random() * 10) + 1);
            map.put(keys, values);
        } while (map.size() != 10);

        System.out.println(map);
    }
}
