package arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        arr[2] = 1;

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); //to sort array
        Arrays.binarySearch(arr, 1); // to search
        
        int[] arr1 = Arrays.copyOfRange(arr, 0, 2);
        System.out.println(Arrays.toString(arr1));
    }
}
