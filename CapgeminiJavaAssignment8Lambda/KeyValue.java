package CapgeminiJavaAssignment8Lambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValue {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(33,"Max");
        map.put(10,"Gasly");
        map.put(11,"Sergio");


        StringBuilder result=new StringBuilder();

        map.forEach((k, v) -> result.append(k).append(v));
        System.out.println("Result String is :"+result);


//        for (Map.Entry<Integer, String> entry :map.entrySet()){
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            result.append(key).append(value);
//        }
//        System.out.println("Result String is :"+result);
    }
}
