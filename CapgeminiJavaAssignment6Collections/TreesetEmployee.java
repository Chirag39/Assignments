package CapgeminiJavaAssignment6Collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreesetEmployee {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        Employee emp1=new Employee("Max",33,"RB",50000);
        Employee emp2=new Employee("Sergio",11,"RB",49000);
        Employee emp3=new Employee("Lewis",44,"Merc",55000);
        Employee emp4=new Employee("Bottas",77,"Merc",45000);
        Employee emp5=new Employee("Norris",4,"McL",30000);
        Employee emp6=new Employee("Charles",16,"Fer",41000);
        Employee emp7=new Employee("Carlos",55,"Fer",40000);
        Employee emp8=new Employee("Daniel",3,"Mcl",35000);
        Employee emp9=new Employee("Gasly",10,"AT",39000);
        Employee emp10=new Employee("Alonso",14,"Alp",38000);

        System.out.println("Enter option : \na) ID \nb) Name \nc) Department \nd) Salary");
        String res= ip.next();
        if(res.equalsIgnoreCase("a")){
            TreeSet<Employee> emp = new TreeSet<Employee>(new myIdComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by ID...");

            for(Employee a:emp){
                System.out.println("ID: "+a.getId()+", Name: "+a.getName()+", Dept: "+a.getDept()+", Salary: "+a.getSal());
            }
        }
        else if(res.equalsIgnoreCase("b")){
            TreeSet<Employee> emp = new TreeSet<Employee>(new myNameComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by name...");
            for(Employee a:emp){
                System.out.println("Name: "+a.getName()+", ID: "+a.getId()+", Dept: "+a.getDept()+", Salary: "+a.getSal());
            }
        }
        else if(res.equalsIgnoreCase("c")){
            TreeSet<Employee> emp = new TreeSet<Employee>(new myDeptComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by Department...");

            for(Employee a:emp){
                System.out.println("Dept: "+a.getDept()+", Name: "+a.getName()+", ID: "+a.getId()+", Salary: "+a.getSal());
            }
        }
        else if(res.equalsIgnoreCase("d")){
            TreeSet<Employee> emp = new TreeSet<Employee>(new mySalComparator());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);
            emp.add(emp5);
            emp.add(emp6);
            emp.add(emp7);
            emp.add(emp8);
            emp.add(emp9);
            emp.add(emp10);
            System.out.println("Sorting by Salary...");

            for(Employee a:emp){
                System.out.println("Salary: "+a.getSal()+", Name: "+a.getName()+", ID: "+a.getId()+", Dept: "+a.getDept());
            }

        }

    }
}
class Employee {

    private String name;
    private int id;
    private String Dept;
    private float salary;

    public Employee(String name, int id,String Dept, float salary)
    {
        this.name = name;
        this.id = id;
        this.Dept=Dept;
        this.salary=salary;
    }

    public Employee() {}

    public String getName() { return name; }
    public String getDept() { return Dept; }
    public float getSal() { return salary; }
    public int getId() { return id; }

}

class myNameComparator implements Comparator<Employee> {
    public int compare(Employee s1, Employee s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class myIdComparator implements Comparator<Employee> {
    public int compare(Employee s1, Employee s2) {
        return s1.getId()-s2.getId();
    }
}

class myDeptComparator implements Comparator<Employee> {
    public int compare(Employee s1, Employee s2){
        return s1.getDept().compareTo(s2.getDept());
    }
}

class mySalComparator implements Comparator<Employee> {
    public int compare(Employee s1, Employee s2) {
        return (int) (s1.getSal()-s2.getSal());
    }
}



