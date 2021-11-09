package CapgeminiJavaAssignment1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        System.out.print("Enter username :");
        String user=ip.nextLine();

        String pass="capgemini";

        int i=1;
        while(i<=3){
            System.out.print("Enter password :");
            String check=ip.nextLine();
            if (check.equals(pass)) {
                System.out.println("Welcome " + user);
                break;
            }
            else {
                if(i<=2)
                    System.out.println("Password incorrect, try again");
                i++;
            }
        }

        if(i==4)
            System.out.println("Contact Admin");

    }
}
