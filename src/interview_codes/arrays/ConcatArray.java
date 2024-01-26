package interview_codes.arrays;

import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
        int [] arr1 = {1, 4, 5};
        int [] arr2 = {8, 12, 5, 9};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));

    }
    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];
        // i -> add to the merged array, also read from the arr1
        // y -> read the elements from the arr2

        for(int i = 0, y = 0; i < merged.length; i++){

            if(i < arr1.length){
                merged[i] = arr1[i];
            } else {
                merged[i] = arr2[y++];
            }

        }

        return merged;
    }
}
 /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */