package org.example.exercisesBubbleSort;

public class BubbleSort10 {

    public static int bubblePassesToSorted(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(i);
            boolean swapFlag = false;


            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapFlag = true;
                }
            }

            if (!swapFlag) {
                return i;
            }

        }
        return nums.length - 1;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
