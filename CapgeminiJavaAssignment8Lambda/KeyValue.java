package CapgeminiJavaAssignment8Lambda;

import java.util.HashMap;
import java.util.Map;

public class KeyValue {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(33,"Max");
        map.put(11,"Sergio");
        map.put(10,"Gasly");

        StringBuilder result=new StringBuilder();

        map.forEach((k, v) -> result.append(k).append(v));
        System.out.println(result);



//        for (Map.Entry<Integer, String> entry :map.entrySet()){
//            Integer key = (Integer)entry.getKey();
//            String value = entry.getValue();
//            result.append(key + value);
//        }
//        System.out.println(result);
    }
}
