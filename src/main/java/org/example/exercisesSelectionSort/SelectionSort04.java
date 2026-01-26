package org.example.exercisesSelectionSort;

public class SelectionSort04 {

    public static int minIndexFrom(int[] nums, int start){
        if(start >= nums.length){
            throw new IndexOutOfBoundsException("O valor start é maior que o número de elementos no array");
        }

        int min = start;
        for (int i = start + 1; i < nums.length; i++) {
            if(nums[min] > nums[i]){
                min = i;
            }

        }
        return min;
    }

}
