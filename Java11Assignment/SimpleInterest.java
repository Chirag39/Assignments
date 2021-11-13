package Java11Assignment;

interface Interest{
    double calc(double a,double b,int c);
}

public class SimpleInterest {
    public static void main(String[] args) {

        var PA=500000;
        var rate=4;
        var time=5;

        Interest i=(var a, var b, var c)->(a*b*c)/100;
        System.out.println(i.calc(PA,rate,time));

    }
}
