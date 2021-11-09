package CapgeminiJavaAssignment1;

public class ArmstrongInRange {
    public static void main(String[] args) {

        for(int num=100;num<1000;num++){
            int temp = num;
            int count = 0;

            while (temp != 0) {
                count += Math.pow((temp % 10), 3);
                temp /= 10;
            }

            if (count == num)
                System.out.println(num + " is an Armstrong number");
        }
    }
}
