package CapgeminiJavaAssignment1;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);

        System.out.print("enter marks for subject 1 : ");
        int sub1=ip.nextInt();

        System.out.print("enter marks for subject 2 : ");
        int sub2=ip.nextInt();

        System.out.print("enter marks for subject 3 : ");
        int sub3=ip.nextInt();

//        //Brute Force Method
//        if(sub1 > 60 && sub2>60 && sub3>60)
//            System.out.println("Passed");
//        else if ((sub1 > 60 && sub2>60)||(sub2>60 && sub3>60)||(sub1 > 60 && sub3>60))
//            System.out.println("Promoted");
//        else
//            System.out.println("Failed");



        // Logical Method
        if(sub1>60){
            if(sub2>60){
                if(sub3>60)
                    System.out.println("Passed");
                else
                    System.out.println("Promoted");
            }
            else if(sub3>60)
                System.out.println("Promoted");
            else
                System.out.println("Failed");
            }
        else if(sub2>60){
            if(sub3>60)
                System.out.println("Promoted");
            else
                System.out.println("Failed");
        }
        else
            System.out.println("Failed");
        }
    }

