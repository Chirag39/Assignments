package CapgeminiJavaAssignment8Lambda;
import java.util.Arrays;
import java.util.List;

public class OrdersAccepted {

    public static void main(String[] args) {

        List<Orders> orders=Arrays.asList(
                new Orders(5000),
                new Orders(15000),
                new Orders(54666),
                new Orders(7000));
        orders.stream()
                .filter(t->t.getPrice()>10000)
                .forEach(t -> System.out.println("order is accepted:"+t));

    }
}
class Orders{
    int price;

    public Orders(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                '}';
    }
}
