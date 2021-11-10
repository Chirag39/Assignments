package CapgeminiJavaAssignment6Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPhone {
    public static void main(String[] args) {
        Contacts c1=new Contacts("Akshay",987650000L,"akki@gmail.com",Gender.Male);
        Contacts c2=new Contacts("Nitin",876540000L,"nitin@gmail.com",Gender.Male);
        Contacts c3=new Contacts("Sawant",765430000L,"sawant@gmail.com",Gender.Female);

        Map<Long, Contacts> treemap = new TreeMap<>();
        treemap.put(c1.PhoneNumber,c1);
        treemap.put(c2.PhoneNumber,c2);
        treemap.put(c3.PhoneNumber,c3);

        //Fetch all keys and print
        for (Map.Entry<Long, Contacts> e : treemap.entrySet()) {
            System.out.println(e.getKey());
        }

        System.out.println("___________________________________________");

        //Fetch all values and print
        for (Map.Entry<Long, Contacts> e : treemap.entrySet()) {
            System.out.println("Name : "+e.getValue().Name+"\nPhone number : "+e.getValue().PhoneNumber+"\nEmail : "+e.getValue().Email+"\nGender : "+e.getValue().Gender);
            System.out.println();
        }

        System.out.println("___________________________________________");

        //print all key values
        for (Map.Entry<Long, Contacts> e : treemap.entrySet()) {
            System.out.println("Key : "+e.getKey()+"\nValues : "+e.getValue().Name+", "+e.getValue().PhoneNumber+", "+e.getValue().Email+", "+e.getValue().Gender);
            System.out.println();
        }

    }

}
class Contacts{
    long PhoneNumber;
    String Name;
    String Email;
    Gender Gender;

    public Contacts(String name,long num, String mail,Gender gen){
        this.Name=name;
        this.PhoneNumber=num;
        this.Email=mail;
        this.Gender=gen;
    }
}
enum Gender{
    Male,Female;
}
