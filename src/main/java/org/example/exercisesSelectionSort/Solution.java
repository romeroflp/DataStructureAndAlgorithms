package org.example.exercisesSelectionSort;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int numtests = Integer.parseInt(input.nextLine());
//        int numCardPlayerOne = Integer.parseInt(input.nextLine());
//        int numCardPlayerTwo = Integer.parseInt(input.nextLine());
//
//        int mdc = numCardPlayerOne;
//
//        while(numCardPlayerTwo != 0){
//            int temp = numCardPlayerTwo ;
//            numCardPlayerTwo = mdc % numCardPlayerTwo;
//            mdc = temp;
//
//        }
//
//        mdc = Math.abs(mdc);
//
//        System.out.println(mdc);
        int test = Integer.parseInt(input.nextLine());

        for (int i = 0; i < test; i++){
            int numCard1 = Integer.parseInt(input.nextLine());
            int numCard2 = Integer.parseInt(input.nextLine());

            int mdc = numCard1;
            while (numCard2 != 0) {
                int temp = numCard2;
                numCard2 = mdc % numCard2;
                mdc = temp;
            }

            mdc = Math.abs(mdc);
            System.out.println(mdc);
        }



    }
}
