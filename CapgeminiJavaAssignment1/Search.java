package CapgeminiJavaAssignment1;

import java.util.Arrays;
import java.util.Scanner;

// Accept a number and search if it is contained in the array

public class Search {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.print("Enter the target: ");
        int target = ip.nextInt();
        int ans = Search(arr, target);

        String result=(ans==-1)?"Element is missing":"Element is present";
        System.out.println(result);
    }

    private static int Search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(target<arr[mid]) end=mid-1;

            else if(target>arr[mid]) start=mid+1;

            else return mid;
        }
        return -1;
    }
}
