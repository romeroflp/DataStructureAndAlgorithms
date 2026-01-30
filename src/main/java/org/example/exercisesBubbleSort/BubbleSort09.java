package org.example.exercisesBubbleSort;

public class BubbleSort09 {

    public static int countMovimentToRight(int[] arr){
        int maxMoves = 0;
        int indexMoreSwap = 0;

        for (int i = 0; i < arr.length; i++) {
            int countMove = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    countMove++;
                }
            }

            if(maxMoves < countMove){
                maxMoves = countMove;
                indexMoreSwap = i;
            }

        }

        return indexMoreSwap;

    }


}
