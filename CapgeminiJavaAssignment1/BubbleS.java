package CapgeminiJavaAssignment1;

import java.util.Arrays;

public class BubbleS {
    public static void main(String[] args) {
        int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        System.out.println("Before Sorting "+Arrays.toString(arr));
        int[]sortedArray= Sort(arr);
        System.out.println("After Sorting "+Arrays.toString(sortedArray));
    }

    private static int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

}
