package CapgeminiJavaAssignment2;

import java.util.Scanner;

abstract class Shapes {
    abstract void input();
    abstract void draw();
}
class Line extends Shapes{
    float l;
    void input(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter length of the line :");
        l= ip.nextFloat();
    }
    void draw(){
        System.out.println("Line of length "+l+" cm is drawn");
    }
}
class Rectangle extends Shapes{
    float l,b;
    void input(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle :");
        l= ip.nextFloat();
        b= ip.nextFloat();
    }
    void draw(){
        System.out.println("Rectangle of length "+l+" cm and breadth of "+b+" cm is drawn");
    }
}
class Cube extends Shapes{
    float l;
    void input(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter length of sides of the cube :");
        l= ip.nextFloat();
    }
    void draw(){
        System.out.println("Cube with sides having length "+l+" cm is drawn");
    }
}

class Main4{
    public static void main(String[] args) {
        Line l=new Line();
        Rectangle r=new Rectangle();
        Cube c=new Cube();

        allowShape(l);
        allowShape(r);
        allowShape(c);
    }

    private static void allowShape(Shapes ref) {
        ref.input();
        ref.draw();
    }
}