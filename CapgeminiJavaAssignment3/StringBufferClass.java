package CapgeminiJavaAssignment3;

import java.nio.Buffer;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("StringBuffer");
        System.out.println(s1.append(" is a peer class of String"+" that provides much of"+" te functionality of strings"));

        StringBuffer s2=new StringBuffer("It is used to  at the specified index position");
        System.out.println(s2.insert(14,"insert text"));

        StringBuffer s3=new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(s3.reverse());
    }
}
