package CapgeminiJavaAssignment2;

import java.util.Scanner;

abstract class Persistence {
    static int input;
    abstract void persist();
}
class FilePersistence extends Persistence{
    int fileStorage;
    void persist(){
        Scanner ip=new Scanner(System.in);
        System.out.println("enter data");
        input= ip.nextInt();
        fileStorage+=super.input;
        System.out.println("File Saved");
    }
}
class DatabasePersistence extends Persistence{
    int dbStorage;
    void persist(){
        System.out.println("enter data");
        Scanner ip=new Scanner(System.in);
        input= ip.nextInt();
        dbStorage+=super.input;
        System.out.println("Data Saved");
    }
}
class Main5{
    public static void main(String[] args) {
        Persistence f1=new FilePersistence();
        Persistence d1=new DatabasePersistence();

    }
}
