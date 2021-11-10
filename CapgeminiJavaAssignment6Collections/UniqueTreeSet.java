package CapgeminiJavaAssignment6Collections;

    /*
    overriding the compare() method, this method compare
    two objects of type Employee on the basis of their id,
    if the ids of two employees is same then its considered
    a duplicate entry. else, it is sorted of the basis of
    id.
    */


import java.util.*;

class UniqueTreeSet{
    public static void main(String args[])
    {
        TreeSet<Product> prod = new TreeSet<>(new Product());
        Scanner ip=new Scanner(System.in);

        // add objects to the TreeSet
        do{
            System.out.print("Enter id : ");
            int id=ip.nextInt();

            ip.nextLine();  // Consume newline left-over

            System.out.print("Enter name : ");
            String name= ip.nextLine();
            prod.add(new Product(name, id));
            System.out.println();
        }while (prod.size()!=10);

        // printing the TreeSet
        for (Product s : prod) {
            System.out.println(s);
        }
    }
}


class Product implements Comparator<Product> {

    private String name;
    private int id;

    public Product(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // default constructor is required, since we have to pass the instance of Comparator in the constructor, while creating a TreeSet
    public Product() {}

    public String getName() { return name; }

    // returns id of the employee
    public int getId() { return id; }


    @Override
    public int compare(Product emp1, Product emp2)
    {
        if (emp1.getId() == emp2.getId()) {
            return 0;
        }
        else if (emp1.getId() < emp2.getId()) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override public String toString()
    {
        return name + " (" + id + ")";
    }
}






