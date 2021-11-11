package CapgeminiJavaAssignment8Lambda;

@FunctionalInterface
interface Arithmetic {
    int operate(int a, int b);
}
public class Calculate {
    public static void main(String[] args) {
        int x=4;
        int y=5;
        Arithmetic add=(a, b)->a+b;
        System.out.println("Sum of 2 numbers is: "+add.operate(x,y));

        Arithmetic sub=(a, b)->a-b;
        System.out.println("Difference of 2 numbers is: "+sub.operate(x,y));

        Arithmetic div=(a, b)->a/b;
        try {
            System.out.println("Division of 2 numbers is: " + div.operate(x, y));
        }catch (ArithmeticException e){
            System.out.println("An arithmetic exception occured");
        }

        Arithmetic mul=(a, b)->a*b;
        System.out.println("Product of 2 numbers is: "+mul.operate(x,y));


    }
}
