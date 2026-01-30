package org.example.exercisesInsertionSort;

public class InsertionSort03 {

    public static int indexDisorder(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] > arr[i]){
                return i;
            }
        }
        return -1;
    }
}
