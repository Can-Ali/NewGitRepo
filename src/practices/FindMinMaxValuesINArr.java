package practices;

public class FindMinMaxValuesINArr {


    public static void main(String[] args) {
        int[] nums = new int[] {-21, 2, 3, 4, 54, 65, 56};
        int[][] nums2 = new int[][] {{1, 2, 3, 4, 54, 65, 56, 897},
                {1324, 223, 32, 4},
                {89, 1324, 2232, 2, 254},
                {1324, -4223, 32, -34}};
        //two methods with same name but
        //different parameters it's called overloading
        //whatever in the () of method, it's called parameters
        //here we are invoking (calling) method
        //out method has parameters, in the case parameter will be an array of nums
        findMinAndMax(nums2);
    }
    //this the same method to find min and max
    //but for 2D arrays
    public static void findMinAndMax(int[][] nums) {
        int min = nums[0][0];
        int max = nums[0][0];
        System.out.println("*********");
//		outer loop
        for(int i = 0; i < nums.length; i++) {
//			inner loop
            for(int j =0; j < nums[i].length;j++) {
                if(max<nums[i][j]) {
                    max = nums[i][j];
                }
                if(nums[i][j]<min) {
                    min = nums[i][j];
                }
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }


    public static void findMinAndMax(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(max<nums[i]) {
                max = nums[i];
            }
            if(nums[i]<min) {
                min = nums[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }


}
