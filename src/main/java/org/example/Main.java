package org.example;

import org.example.exercisesInsertionSort.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.begginingExercises.EasyExercises.*;

import static org.example.exercisesBubbleSort.BubbleSort01.insertion;
import static org.example.exercisesInsertionSort.InsertionSort06.sortedPrefixLength;

public class Main {

    public static void main(String[] args) {

//        List<String> nums = new LinkedList<>(List.of("4", "2", "3"));
        int[] arr = {5, 4, 3};
        System.out.println(Arrays.toString(insertion(arr)));


//        LinkedList list = new LinkedList(new LinkedList.LinkNode(2, new LinkedList.LinkNode(3, new LinkedList.LinkNode(4, new LinkedList.LinkNode(5, null)))));
//        list.insertHead(1);
//        int value = list.get(1);


//        System.out.println(countDigits(2222455));

    }



}