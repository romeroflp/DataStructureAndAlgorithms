package org.example.exercisesInsertionSort;

public class InsertionSort02 {

    public static boolean almostSorted(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int countSwaps = 0;
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){

                arr[j + 1] = arr[j];
                j--;
                countSwaps++;

                System.out.println(j);
            }

            if(countSwaps == 1){
                return false;
            }

            arr[j + 1] = key;

        }

        return true;

    }

}
