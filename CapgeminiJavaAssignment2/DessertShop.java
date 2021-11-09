package CapgeminiJavaAssignment2;

import java.util.Scanner;

abstract class Dessertitem {
    static int candyCount;
    static int icecreamCount;
    static int cookieCount;
    abstract void storeItem(int num);
    abstract void getCost(int num);
}

class Cookie extends Dessertitem{
    float total;
    void getCost(int qty) {
        total= (float) (qty*0.1);
    }
    void storeItem(int num) {
        cookieCount+=num;
    }
}

class Candy extends Dessertitem{
    float total;
    void getCost(int qty) {
        total= (float) (qty*0.1);
    }
    void storeItem(int num) {
        candyCount+=num;
    }

}

class Icecream extends Dessertitem{
    float total;
    void getCost(int qty) {
        total= (qty*50);
    }
    void storeItem(int num) {
        icecreamCount+=num;
    }

}

class Main6{
    public static void main(String[] args) {
        Cookie cookie=new Cookie();
        Candy candy=new Candy();
        Icecream ic=new Icecream();

        Scanner ip=new Scanner(System.in);
        System.out.println("Enter your role : 1) Owner 2) Customer");
        int role= ip.nextInt();
        if(role==1){
            System.out.print("Number of Cookies to be added in the store: ");
            int qty1=ip.nextInt();
            addDessert(cookie,qty1);

            System.out.print("Number of Candies to be added in the store: ");
            int qty2=ip.nextInt();
            addDessert(candy,qty2);

            System.out.print("Number of Ice-creams to be added in the store: ");
            int qty3=ip.nextInt();
            addDessert(ic,qty3);

            System.out.println();
            System.out.println();
            System.out.println("Total Cookies :"+Dessertitem.cookieCount);
            System.out.println("Total Candies :"+Dessertitem.candyCount);
            System.out.println("Total IceCreams :"+Dessertitem.icecreamCount);
        }

        if(role==2){
            System.out.println("Cost of Desserts: \nIcecream: 25rs \nCandy: 6rs \nCookie: 7rs");
            System.out.print("Number of Ice-creams :");
            int qty1= ip.nextInt();
            placeOrder(ic,qty1);

            System.out.print("Number of candies :");
            int qty2= ip.nextInt();
            placeOrder(candy,qty2);

            System.out.print("Number of cookies :");
            int qty3= ip.nextInt();
            placeOrder(cookie,qty3);

            System.out.println();
            System.out.println("Total cost of "+qty1+" Ice-creams is "+ic.total+" rupees");
            System.out.println("Total cost of "+qty2+" candies is "+candy.total+" dollars");
            System.out.println("Total cost of "+qty3+" cookies is "+cookie.total+" euros");

        }

    }

    private static void addDessert(Dessertitem ref, int qty) {
        ref.storeItem(qty);
    }

    private static void placeOrder(Dessertitem ref, int qty) {
        ref.getCost(qty);
    }
}


