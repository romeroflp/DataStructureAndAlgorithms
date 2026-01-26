package org.example.exercisesSelectionSort;

public class SelectionSort06 {

    public static boolean canBeSortedByOneSwap(int[] nums){
        int countSwap = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
                countSwap++;

                if(countSwap > 1) return false;
            }

        }

        return true;

    }
}
