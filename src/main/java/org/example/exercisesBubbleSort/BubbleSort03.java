package org.example.exercisesBubbleSort;

public class BubbleSort03 {
    public static int firstUnsortedIndex(int[] nums){
        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]){
                return i;
            }
        }
        return -1;

    }
}
