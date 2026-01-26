package org.example.exercisesSelectionSort;

import java.util.List;

public class SelectionSort01 {

    public static int[] selectionSortEx(int[] arr){
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if(arr[j] > arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return arr;

    }

    public static List<String> bigSorting (List<String> unsorted) {
        for(int i = 0; i < unsorted.size() - 1; i++){
            int min = i;

            for(int j = 1 + i; j < unsorted.size(); j++){
                if(Long.parseLong(unsorted.get(min)) > Long.parseLong(unsorted.get(j))){
                    min = j;
                }
            }

            String temp = unsorted.get(i);
            unsorted.set(i, unsorted.get(min));
            unsorted.set(min, temp);

        }

        return unsorted;


    }



}
