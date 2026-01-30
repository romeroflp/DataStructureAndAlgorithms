package org.example.exercisesBubbleSort;

public class BubbleSort07 {

    public static boolean SortingInKtimes(int[] arr, int k){
        int countComparetions = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                    countComparetions++;
                    System.out.println(countComparetions);
                }
            }



            if(!swap){
                return countComparetions <= k;
            }

        }
        return countComparetions <= k;
        
    }
}
