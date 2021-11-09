package CapgeminiJavaAssignment1;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];

        insertMarks(arr);

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        findStudentsMarks(arr);

        findSubjectMarks(arr);

    }

    private static void findSubjectMarks(int[][] arr) {
        for(int i=0;i<3;i++){
            int total=0;
            for(int j=0;j<3;j++){
                total+=arr[j][i];
            }
            System.out.println("Total marks scored by students in Subject "+(i+1)+" : "+total+" , Average marks :"+total/3);
        }
    }

    private static void findStudentsMarks(int[][] arr) {
        for(int i=0;i<3;i++){
            int total=0;
            for(int j=0;j<3;j++){
                total+=arr[i][j];
            }
            System.out.println("Student "+(i+1)+" Total marks : "+total+" , Average marks :"+total/3);
        }
        System.out.println();
    }

    private static void insertMarks(int[][] arr) {
        Scanner ip=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter marks for Student "+(i+1));
            for (int j = 0; j <3 ; j++) {
                arr[i][j]= ip.nextInt();
            }
        }
    }

}
