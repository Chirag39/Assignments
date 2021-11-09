package CapgeminiJavaAssignment2;

abstract class Employee {
    abstract void addSalary(int Salary);
    static int sal;
    public static void Total(){
        System.out.println("Total salary of all Employees: "+sal);
    }
}

class Manager extends Employee{
    int totalEarnings;
    public void addSalary(int sal){
        totalEarnings+=sal;
        super.sal+=sal;
        System.out.println("Manager gets "+sal+" including incentives");
    }
}

class Labour extends Employee{
    int totalEarnings;
    public void addSalary(int sal){
        totalEarnings+=sal;
        super.sal+=sal;
        System.out.println("Labour gets "+sal+" for overtime");
    }}


class Main1{
    public static void main(String[] args) {
        Manager m1=new Manager();
        Manager m2=new Manager();
        Labour l1=new Labour();
        Labour l2=new Labour();

        addSalary(m1,50000);
        addSalary(m2,50000);    //new manager

        addSalary(l1,21000);    // labour 1
        addSalary(l2,21000);    // labour 2
        addSalary(l2,21000);    // adding with previous salary in labour 2


//  individual earnings can be found
//        System.out.println("Total earning by labour1 :"+l1.totalEarnings);
//        System.out.println("Total earning by labour2 :"+l2.totalEarnings);

//  if objects are created using Employee reference
//        int totalEarnings = ((Manager) m1).totalEarnings;

        Employee.Total();
    }

    private static void addSalary(Employee ref, int amount) {
        ref.addSalary(amount);
    }
}

