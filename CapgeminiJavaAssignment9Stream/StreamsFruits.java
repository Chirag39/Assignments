package CapgeminiJavaAssignment9Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsFruits {
    public static void main(String[] args) {
       fruitsquestions();
    }

    private static void fruitsquestions() {
        List<Fruits> fruit= Arrays.asList(
                new Fruits("Apple",70,50,"Red"),
                new Fruits("Cheery",50,30,"Red"),
                new Fruits("Mango",101,70,"Yellow"),
                new Fruits("Orange",80,30,"Orange"),
                new Fruits("Banana",120,40,"Yellow"));

        System.out.println("Sorting by calories in descending order");
        fruit.stream()
                .filter(t->t.getCalories()<100)
                .sorted(Comparator.comparingInt(Fruits::getCalories).reversed())
                .forEach(t-> System.out.println(t.getName()));

        System.out.println("____________________________");
        System.out.println("Color wise names of fruit");
        fruit.stream()
                .sorted(Comparator.comparing(Fruits::getColor))
                .forEach(t-> System.out.println(t.getColor()+"  "+t.getName()));

        System.out.println("______________________");
        System.out.println("Sorting by price of Red color fruits");
        fruit.stream()
                .filter(t->t.getColor().equalsIgnoreCase("red"))
                .sorted(Comparator.comparingInt(Fruits::getPrice))
                .forEach(t-> System.out.println(t.getName()));
    }

}

class Fruits{
     String name;
     int calories;
     int price;
     String color;

    public Fruits(String name,int calories,int price,String color) {
        this.name = name;
        this.calories=calories;
        this.price=price;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
