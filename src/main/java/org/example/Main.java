package org.example;

import java.util.ArrayList;
import java.util.List;


import static org.example.exercisesInsertionSort.InsertionSort02.almostSorted;

public class Main {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>(List.of("4", "2", "3"));
        int[] arr = {1, 3, 2, 4, 5};
        System.out.println(almostSorted(arr));

    }
}