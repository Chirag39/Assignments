package CapgeminiJavaAssignment7Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
    int test_case();
}

public class Anno1 {
    public static void main(String[] args) {
        show1();
    }

    @Test(test_case =2)
    public static void show(){
        System.out.println("Method2");
    }

    @Test(test_case =1)
    public static void show1(){
        System.out.println("Method1");
    }
}


//this gives error, cant apply on class
// @Test
//class Champ{
//    String name;
//}
