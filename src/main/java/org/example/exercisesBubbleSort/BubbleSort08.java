package org.example.exercisesBubbleSort;

import java.util.Arrays;

public class BubbleSort08 {

    public static int countMoveRight(int[] arr){

        int[] amountComparisonsForIndex = new int[arr.length];
        int[] index = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            index[i] = i;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swaps = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){

                    amountComparisonsForIndex[index[j]]++;
                    System.out.println("Quantidade de trocas: " + Arrays.toString(amountComparisonsForIndex));

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    int tempIdx = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = tempIdx;

                    System.out.println("Indices" + Arrays.toString(index));

                }
            }

            if(!swaps){
                break;
            }
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < amountComparisonsForIndex.length; i++) {
            if(amountComparisonsForIndex[i] > max){
                max = amountComparisonsForIndex[i];
                maxIndex = i;
            }
        }

        return maxIndex;




    }
}


//