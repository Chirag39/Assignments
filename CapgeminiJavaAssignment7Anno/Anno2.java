package CapgeminiJavaAssignment7Anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@interface Info{
    int AuthorID();
    String Author() default "Charles";
    String Supervisor() default "Binotto";
    String Date();
    String Time();
    int Version();
    String Description() default "Ferrari F1";
}



@Info(AuthorID = 3, Date = "15-11-2021",Time = "6:30",Version = 1)
public class Anno2 {
    public static void main(String[] args) {

    }

    @Info(AuthorID = 16,Author = "Leclerc",Date = "15-11-2021",Time = "6:30",Version = 2)
    public void driver() {

    }
}
