package Java11Assignment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

@FunctionalInterface
interface Total {
    int addPrice(int a, int b);
}
public class PriceQ5 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int total=0, option=0, price, count=1;

        var path="C:\\Users\\chira\\Desktop\\update assignment\\Java11Assignment\\Price.txt";
        var path1="C:\\Users\\chira\\Desktop\\update assignment\\Java11Assignment\\Total.txt";
        String resp;
        Total sum=(t,n)->t+n;

        do {
            System.out.println("Select your option \n 1: Insert New Price, 2: View Purchase, 3: Exit");
            option=ip.nextInt();

            if(option==1){
                do {
                    System.out.println("Insert price " + count);
                    count++;
                    price = ip.nextInt();
                    total = sum.addPrice(total, price);
                    try {
                        Files.writeString(Path.of(path),price+ "\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {}

                    ip.nextLine();
                    System.out.println("Do you want to enter more items? (Yes/No)");
                    resp=ip.nextLine();
                }while(!resp.equalsIgnoreCase("NO"));

            }
            if(option==2) {
                System.out.println("Total price of all items is " + total);
                try {
                    Files.writeString(Path.of(path1),total+ "\n", StandardOpenOption.APPEND);
                } catch (IOException e) {}

            }
        }while(option!=3);
    }
}
