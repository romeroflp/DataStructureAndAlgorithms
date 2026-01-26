package org.example.exercisesBubbleSort;

public class BubbleSort01 {

    public static boolean isSorted(int[] arr){
        boolean sort = true;

        for (int j = 1; j < arr.length; j++) {
            if(arr[j - 1] > arr[j]){
                sort = false;
            }
            if(!sort){
                return sort;

            }
        }

            return sort;
    }




}
