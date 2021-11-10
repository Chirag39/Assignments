package CapgeminiJavaAssignment6Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class LeapYear {

    public static void main(String args[])
    {
        String Date1="03-04-2000";
        String Date2="25-05-2007";
        String Date3="17-02-1997";

        Date d1=null;
        try {
            d1 = new SimpleDateFormat("dd-MM-yyyy").parse(Date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date d2=null;
        try {
            d2 = new SimpleDateFormat("dd-MM-yyyy").parse(Date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date d3=null;
        try {
            d3 = new SimpleDateFormat("dd-MM-yyyy").parse(Date3);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        LinkedList<Date> list1 = new LinkedList<>();
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);

        int i=list1.size()-1;
        while(i>=0){
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String Date= formatter.format(list1.get(i));
            System.out.print("Your date of Birth is "+Date + " ");

            int year=1900+list1.get(i).getYear();

            if ((year % 4 == 0) && (year % 100!= 0) || (year %400 == 0)) {
                System.out.println("and it was a leap year");
            }
            else {
                System.out.println("and it was not a leap year");
            }
            i--;

        }
    }

}
