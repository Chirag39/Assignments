package CageminiJavaAssignment5;

import java.util.Date;

public class Pair {
    public static void main(String[] args) {
        pair1();
        System.out.println();
        pair2();
    }
    private static void pair1() {
        System.out.println("Strings as key and value");
        PairA<String,String> obj1=new PairA<>("33","Max");

//        obj1.setKey(11);   -- error
//        obj1.setKey("11");
//        obj1.setValue("Checo");

        System.out.println("Key : "+ obj1.getK()+"\nValue : "+obj1.getE() );
    }
    private static void pair2() {
        System.out.println("String as key and Date as value");
        Date d=new Date();
        PairB<String,Date> obj2= new PairB<>("Spain", d);
        System.out.println("Key : "+ obj2.getK()+"\nValue : "+obj2.getE() );

    }
}
class PairA<K,E> {
    Object K,E;

    public PairA(K key, E value) {
        this.K=key;
        this.E=value;
    }

    public void setKey(K key) {
        K = key;
    }
    public void setValue(E value) {
        E = value;
    }

    public Object getK() {
        return K;
    }
    public Object getE() {
        return E;
    }
}
class PairB<K,E>{
    Object K,E;
    public PairB(K key,E value) {
        this.K=key;
        this.E=value;
    }
    public Object getK() {
        return K;
    }
    public Object getE() {
        return E;
    }
}
