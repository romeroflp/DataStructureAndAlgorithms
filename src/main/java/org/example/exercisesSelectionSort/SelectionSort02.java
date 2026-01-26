package org.example.exercisesSelectionSort;

public class SelectionSort02 {

    public static int swapCount(int[] arr){
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            swaps++;
        }

        return swaps;

    }


}
