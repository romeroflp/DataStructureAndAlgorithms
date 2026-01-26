package org.example.exercisesInsertionSort;

public class InsertionSort01 {

    public static boolean isSorted(int[] arr){
        boolean sorted = true;

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
                sorted = false;
            }

        }
        return  sorted;

    }


}
