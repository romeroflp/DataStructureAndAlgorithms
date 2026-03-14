package org.example.exercisesInsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort06 {

    public static int sortedPrefixLength(int[] nums){
       int size = nums.length;
       int[] sufixMin = new int[size];

       sufixMin[size - 1] = nums[size - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            sufixMin[i] = Math.min(sufixMin[i + 1], nums[i]);
        }

        int prefixMax = nums[0];

        System.out.println(Arrays.toString(sufixMin));
        for (int i = 0; i < nums.length - 1; i++) {
            prefixMax = Math.max(prefixMax, nums[i + 1]);

            if(prefixMax > sufixMin[i + 1]){
                prefixMax = nums[i];
                return prefixMax;
            }


        }
        return nums[size - 1];
    }
}
