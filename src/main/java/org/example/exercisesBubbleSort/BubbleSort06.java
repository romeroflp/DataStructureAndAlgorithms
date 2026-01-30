package org.example.exercisesBubbleSort;

import java.util.Arrays;

public class BubbleSort06 {

    public static int indexLastSorting(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if(!swap){
                return i;
            }

        }
        return arr.length - 2;
    }

}
