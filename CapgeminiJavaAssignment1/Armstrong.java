package CapgeminiJavaAssignment1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);

        System.out.println("Enter the number");
        int num=ip.nextInt();

        int digits=0;
        int temp=num;
        while(temp!=0){
            temp/=10;
            digits++;
        }

        temp=num;
        int count=0;
        while(temp!=0){
            count+=Math.pow((temp%10),digits);
            temp/=10;
        }

        if(count==num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
