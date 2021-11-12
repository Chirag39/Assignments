package CapgeminiJavaAssignment7Anno;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int Sequence() default 0;
}

public class Anno3 {
    public static void main(String[] args) {
       
    }
}
class execution{

    @Execute(Sequence = 2)
    public void myMethod1(){
        System.out.println("In method 2");
    }
    @Execute(Sequence = 1)
    public void myMethod2(){
        System.out.println("In method 1");
    }
    @Execute(Sequence = 3)
    public void myMethod3(){
        System.out.println("In method 3");
    }

}