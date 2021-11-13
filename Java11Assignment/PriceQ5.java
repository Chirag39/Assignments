package Java11Assignment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class PriceQ5 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int total=0, option, price, count=1;

        var path="C:\\Users\\chira\\Desktop\\update assignment\\Java11Assignment\\Price.txt";
        var path1="C:\\Users\\chira\\Desktop\\update assignment\\Java11Assignment\\Total.txt";
        String resp="yes";

        do {
            System.out.println("Select your option \n 1: Insert New Price, 2: View Purchase, 3: Exit");
            option=ip.nextInt();

            if(option==1){
                while(resp.equalsIgnoreCase("yes")){
                    System.out.println("Insert price " + count);
                    count++;
                    price = ip.nextInt();
                    total+=price;
                    try {
                        Files.writeString(Path.of(path),price+ "\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {}

                    ip.nextLine();
                    System.out.println("Do you want to enter more items? (Yes/No)");
                    resp=ip.nextLine();
                    if(resp.equalsIgnoreCase("no"))
                        break;
                }

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
