package CageminiJavaAssignment5;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        Employee emp1=new Employee(1000,"Akshay",20000,"SE");
        Employee emp2=new Employee(1001,"Nitin",20000,"SE");
        Employee emp3=new Employee(1002,"Sawant",40000,"Manager");

        HashSet<Employee> emp=new HashSet<>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        
        System.out.println("Details of Employees: ");
        for(Employee a:emp){
            a.displayDetails();
        }
    }



}
class Employee{
    int id;
    float salary;
    String name, department;
    public Employee(int id, String name, float salary, String department){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public void displayDetails(){
        System.out.println("id :"+id+", Name :"+name+", salary :"+salary+", Dept :"+department);
    }
}
