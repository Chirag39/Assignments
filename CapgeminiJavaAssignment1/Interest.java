package CapgeminiJavaAssignment1;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        System.out.print("Enter the Principal Amount : ");
        double P=ip.nextDouble();
        System.out.print("Enter Rate of interest (p.a): ");
        double r=ip.nextDouble();
        System.out.print("Enter Time period (in years) : ");
        int t=ip.nextInt();

        double SI=(P*r*t)/100;
        System.out.println("Simple Interest is "+SI);

        float CI = (float) (P *(Math.pow((1 + r / 100), t)));
        System.out.println("Compound Interest is "+CI);
    }

}
