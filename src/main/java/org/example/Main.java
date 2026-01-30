package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.example.exercisesBubbleSort.BubbleSort10.bubblePassesToSorted;
import static org.example.exercisesInsertionSort.InsertionSort04.insertionShiftCount;
import static org.example.exercisesInsertionSort.InsertionSort05.insertionStateAfterK;
import static org.example.exercisesSelectionSort.SelectionSort08.selectionSwapCount;


public class Main {

    public static void main(String[] args) {


        // 4,3,2,5 1 passada
        //3,2,4,5 2 passada

        List<String> nums = new ArrayList<>(List.of("4", "2", "3"));
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(insertionStateAfterK(arr, 2)));
//        ListNode head = new ListNode(3, new ListNode(2, new ListNode(1)));
//        Solution solution = new Solution();
//
//        System.out.println(solution.insertionSortList(head));
    }
}