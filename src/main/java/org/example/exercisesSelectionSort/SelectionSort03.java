package org.example.exercisesSelectionSort;

import java.util.Arrays;

public class SelectionSort03 {

    public static int countSwap(int[] arr){
        int numSwap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                    numSwap++;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
        return numSwap;
    }
}
