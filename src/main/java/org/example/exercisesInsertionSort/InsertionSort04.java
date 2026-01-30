package org.example.exercisesInsertionSort;

public class InsertionSort04 {

    public static long insertionShiftCount(int[] nums){
        int shiftCount = 0;
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;

                shiftCount++;
            }

            nums[j + 1] = key;

        }

        return shiftCount;

    }


}
