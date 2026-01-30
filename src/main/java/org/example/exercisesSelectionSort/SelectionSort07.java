package org.example.exercisesSelectionSort;

public class SelectionSort07 {

    public static int prefixNotChange(int[] arr){

        int changes = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int prefix = arr[0];
            int min = i;

            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            if(prefix != arr[0]){
                changes++;
            }

        }

        return changes;

    }

}
