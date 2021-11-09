package CapgeminiJavaAssignment3;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("StringBuilder");
        System.out.println(s1.append(" is a peer class of String"+" that provides much of"+" te functionality of strings"));

        StringBuilder s2=new StringBuilder("It is used to  at the specified index position");
        System.out.println(s2.insert(14,"insert text"));

        StringBuilder s3=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(s3.reverse());
    }
}
