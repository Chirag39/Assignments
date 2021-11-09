package CapgeminiJavaAssignment3;

import java.util.Locale;

public class String1 {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println("Hello".concat(" How are you?"));
        String a="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace('a','$'));
        System.out.println(a.contains("collection"));
        System.out.println(a.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println(a.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
    }
}
