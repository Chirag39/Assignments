package CapgeminiJavaAssignment9Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamsTrade {
    public static void main(String[] args) {
        tradequestions();
    }


    private static void tradequestions() {
        Trader t1=new Trader("Max","Mumbai");
        Trader t2=new Trader("Sergio","Pune");
        Trader t3=new Trader("Lewis","Pune");
        Trader t4=new Trader("Alonso","Delhi");
        Trader t5=new Trader("Carlos","Delhi");

        List<Trader> traders=new ArrayList<>();
        traders.add(t1);
        traders.add(t2);
        traders.add(t3);
        traders.add(t4);
        traders.add(t5);

        Transaction trans1=new Transaction(t1,2010,50000);
        Transaction trans2=new Transaction(t1,2011,40000);
        Transaction trans3=new Transaction(t2,2011,30000);
        Transaction trans4=new Transaction(t3,2012,40000);
        Transaction trans5=new Transaction(t4,2012,40000);
        Transaction trans6=new Transaction(t5,2012,40000);

        List<Transaction> transaction=new ArrayList<>();
        transaction.add(trans1);
        transaction.add(trans2);
        transaction.add(trans3);
        transaction.add(trans4);
        transaction.add(trans5);
        transaction.add(trans6);


        System.out.println("All transactions of 2011 sorted");
        transaction.stream()
                .filter(t->t.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(t-> System.out.println(t.getValue()));
        System.out.println("_______________________________");

        System.out.println("Names of traders from Pune sorted");
        traders.stream()
                .filter(t->t.getCity().equalsIgnoreCase("Pune"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(t-> System.out.println(t.getName()));
        System.out.println("_______________________________");

        System.out.println("String of Traders Names (sorted)");
        StringBuilder s=new StringBuilder();
        traders.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(t-> s.append(t.getName()));
        System.out.println(s);
        System.out.println("_______________________________");

        System.out.println("Any Traders from Indore? ");
        boolean isIndore=traders.stream()
                .anyMatch(t-> t.getCity().equalsIgnoreCase("Indore"));
        System.out.println(isIndore);
        System.out.println("_______________________________");

        System.out.println("All transactions of traders from Delhi");
        transaction.stream()
                .filter(t->t.getCity().equalsIgnoreCase("Delhi"))
                .forEach(t-> System.out.println(t.getValue()));
        System.out.println("_______________________________");

        System.out.println("Highest value of transaction");
        transaction.stream().max(Comparator.comparing(Transaction::getValue))
                .ifPresent(t-> System.out.println("Trader with max transaction of "+t.getValue()+" is "+t.getName()));
        System.out.println("_______________________________");

        System.out.println("Smallest value of transaction");
        transaction.stream().min(Comparator.comparing(Transaction::getValue))
                .ifPresent(t-> System.out.println("Trader with min transaction of "+t.getValue()+" is "+t.getName()));
        System.out.println("_______________________________");



    }
}

class Trader{
    String name;
    String city;

    public Trader(String name,String city){
        this.name=name;
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public String getName(){
        return name;
    }

}

class Transaction{
    Trader trader;
    int year;
    int value;
    public Transaction(Trader trader,int year,int value){
        this.trader=trader;
        this.year=year;
        this.value=value;
    }

    public int getYear(){ return this.year;}

    public int getValue(){ return this.value;}

    public String getCity(){
        return this.trader.city;
    }

    public String getName(){
        return this.trader.name;
    }
}