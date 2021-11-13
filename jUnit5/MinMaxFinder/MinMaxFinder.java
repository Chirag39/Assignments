public class MinMaxFinder {
    int[] findMinMax(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i:arr) {
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }
        return new int[]{min, max};
    }
}
