package interview_codes;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDup(3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3)));
    }

    public static int[] removeDup(int... arr){

        Set<Integer> unique = new LinkedHashSet<>();
        for(int each : arr){ // adds all the elements are the array into the Set
            unique.add(each);
        }

        int[] uniqueArr = new int[unique.size()];
        int index = 0;

        for(int each : unique){ // read the values from the Set and assign into the array
            uniqueArr[index++] = each;
        }

        return uniqueArr;
    }


}

    /*
        Remove Duplicates

        Create a method that will remove the duplicate values from an int array
        The returning array should only have one occurrence of each number

        Ex:
            Input:
                [3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3]
            Output:
                [3, 4, 5, 1, 2, 6]

     */
