package Java11Assignment;
import java.util.ArrayList;

public class Q2var {

//    var x=50;
// var cannot be used in an instance and global variable declaration

    public static void main(String[] args) {
        var x =50;          //this is acceptable
//        var s;              //var cannot be used without explicit initialization


//      var<var> l1=new ArrayList<>();
//      We need to Specify Type, var cannot be used as a Generic type


//        var<Integer> l2=new ArrayList<>();
//        Even if generic type is specified, var cannot be used with the generic type

//        var cannot be used for method parameters and return type
//        var res=method1();

    }
//    static var method1() {return ("Inside Method1");}
//    static method2(var a){System.out.println(a);}

}
