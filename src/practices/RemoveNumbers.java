package practices;

import java.util.Arrays;

public class RemoveNumbers {

    public static void main(String[] args) {
        int[] nums = { 234, 3, 5, 44, 5, 76, 5, 35, 9 };
        // before {234,3,5,44,5,76,5,35,9};
        System.out.println(Arrays.toString(removeNumber(nums, 5)));

        // after {234,3,44,76,35,9};
        String str = "Certif34534ied Wo345oden 42354Spoon34534java";
        System.out.println(str.replaceAll("\\w", "*"));
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("^Cert", "*"));
        System.out.println(str.replaceAll("java$", "*"));
    }

    // write a method that will remove certain numbers
    // from array of integers
    public static int[] removeNumber(int[] arr, int target) {
        int counter = 0;
        // we are counting how many elements with a value of target do we have in the
        // array
        for (int i : arr) {
            if (i == target) {
                counter++;
            }
        }
        // we are need to create an array for new values
        // this array will contain all values from old array
        // except target number
        int[] newArr = new int[arr.length - counter];
        // we need to copy all values from old array to the new array except target
        // number
        for (int i = 0, j = 0; i < arr.length; i++) {
            //if number doesn't equals to target
            //add this number to the new array
            if (arr[i] != target) {
                //j - index is responsible for the new array
                //i - index is responsible for the old array
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

}
