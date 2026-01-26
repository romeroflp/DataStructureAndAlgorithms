package org.example.exercisesSelectionSort;

import java.util.Arrays;

public class SelectionSort05 {

    public static int selectionSwapCount(int[] nums){
        int countSwap = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            if(temp != nums[min]){
                countSwap++;
            }
            nums[i] = nums[min];
            nums[min] = temp;
        }

        return countSwap;
    }
}
