package org.example.exercisesBubbleSort;

import java.util.Arrays;

public class BubbleSort02 {

    public static int bubblePassSwaps(int[] arr){
        int countSwaps = 0;

        for (int j = 0; j < arr.length - 1 ; j++) {
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                countSwaps++;

            }
        }

        return countSwaps;

    }

}
