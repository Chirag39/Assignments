package CapgeminiJavaAssignment6Collections;
import java.util.*;

class UniqueTreeSet{
    public static void main(String args[])
    {
        TreeSet<Product> prod = new TreeSet<>(new Product());
        Scanner ip=new Scanner(System.in);

        // adding 10 unique objects to the TreeSet
        do{
            System.out.print("Enter name : ");
            String name= ip.nextLine();
            prod.add(new Product(name));
        }while (prod.size()!=10);

        System.out.println("_________________");
        // printing the TreeSet
        for (Product s : prod) {
            System.out.println(s);
        }
    }
}


class Product implements Comparator<Product> {
    private String name;

    public Product(String name)
    {
        this.name = name;
    }

    // default constructor is required, since we have to pass the instance of Comparator in the constructor, while creating a TreeSet
    public Product() {}

    public String getName() { return name; }

    public int compare(Product s1, Product s2){
        return s1.getName().compareTo(s2.getName());
    }

    @Override public String toString(){
        return name;
    }
}






