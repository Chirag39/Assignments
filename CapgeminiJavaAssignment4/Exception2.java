package CapgeminiJavaAssignment4;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter the Numerator : ");
        float a=ip.nextInt();
        System.out.print("Enter the Denominator : ");
        float b=ip.nextInt();
        float div;


        try{
            if(b==0)        //had to do this since intelliJ displays div as "Infinity"J
                throw new UnsupportedOperationException("Cant divide by zero");
            else{
                div=a/b;
                System.out.println("Division of two numbers is :"+div);
            }
        }catch(UnsupportedOperationException e){
            System.out.println(e);
        }
    }
}
//class UnsupportedOperationException extends Exception
//{
//    public UnsupportedOperationException(String str)
//    {
//        super(str);
//    }
//}