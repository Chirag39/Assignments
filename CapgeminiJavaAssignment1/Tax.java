package CapgeminiJavaAssignment1;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);

        System.out.println("Enter your Income");
        float income=ip.nextFloat();

        if(income>500000 && income<1000001)
            System.out.println("Payable income tax according to 30% is :"+((income*30)/100));
        else if(income>300000)
            System.out.println("Payable income tax according to 20% is :"+((income*20)/100));
        else if(income>181000)
            System.out.println("Payable income tax according to 10% is :"+((income*10)/100));
        else
            System.out.println("Not applicable");


    }
}
