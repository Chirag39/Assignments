package CapgeminiJavaAssignment6Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class LeapDate {
    public static void main(String[] args) {
        LinkedList<Object> list1=new LinkedList<>();
        int year,day;


        for (int i = 0; i < 3; i++) {
            GregorianCalendar gc = new GregorianCalendar();

            year = randBetween(1900, 2015);
            gc.set(gc.YEAR, year);
            day= randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, day);
            list1.add(gc);

            if (((gc.get(gc.YEAR) % 4 == 0) && (gc.get(gc.YEAR) % 100!= 0)) || (gc.get(gc.YEAR)%400 == 0))
                System.out.println("Your date of birth is "+gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.YEAR)+" and it was a leap year");
            else
                System.out.println("Your date of birth is "+gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.YEAR)+" and it was NOT a leap year");

        }
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
