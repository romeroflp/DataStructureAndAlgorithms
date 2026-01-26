package org.example.exercisesBubbleSort;

public class BubbleSort04 {

    public static boolean bubbleSortedEarly(int[] nums){

        for (int i = 1; i < nums.length ; i++) {
            if(nums[i - 1] > nums[i]){
                return false;
            }

        }
        return true;
    }


}
