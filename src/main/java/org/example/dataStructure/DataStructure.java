package org.example.dataStructure;

import java.util.Arrays;
import java.util.List;

public class DataStructure {

    public static List<Integer> selectionSort(List<Integer> nums){

        for (int i = 0; i < nums.size() - 1 ; i++) {
            int min = i;

            for (int j = i + 1; j < nums.size(); j++) {
                if(nums.get(j) < nums.get(min)){
                    min = j;
                }
            }

            int temp = nums.get(i);
            nums.set(i, nums.get(min));
            nums.set(min, temp);

            // 4, 2, 3

        }
        return nums;
    }
    // A "pegadinha" desse algoritmo e somar a variável do for externo com a interna
    // Dessa forma, vai separar o que ja foi ordenado, do que ainda esta faltando
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int menorIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menorIndex]) {
                    menorIndex = j;
                }
            }

            // troca
            int temp = arr[i];
            arr[i] = arr[menorIndex];
            arr[menorIndex] = temp;
        }
    }

    public static int[] bubbleSort(int[] arr){
        boolean swap;

        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }


        }

        return arr;

    }
// - i -> serve como forma de reduzir o trabalho, reduzindo os valores q J tem q percorrer
    //Pois ja estão ordenados

     public static int[] insertionSort(int[] arr){

         for (int i = 1; i < arr.length; i++) {

             int key = arr[i];
             int j = i - 1;

             while(j >= 0 && arr[j] > key){

                 arr[j + 1] = arr[j];
                 j--;

                 System.out.println("1"+ Arrays.toString(arr));

             }
             System.out.println(j);
             arr[j + 1] = key;
             System.out.println("2: " + Arrays.toString(arr));
         }

         return arr;
     }

}
