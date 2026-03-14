package org.example.training;

import java.util.Scanner;

public class Ex1022 {

    public static int mdc(int a , int b){
        return (b == 0) ? Math.abs(a) : mdc(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();

        while(tests-- > 0){
            int N1 = input.nextInt();
            input.next();
            int D1 = input.nextInt();

            String op = input.nextLine();

            int N2 = input.nextInt();
            input.next();
            int D2 = input.nextInt();

            int num = 0;
            int den = 0;

            switch(op){
                case "+" -> {
                    num = (N1 * D2) + (N2 * D1);
                    den = D1 * D2;
                }
                case "-" -> {
                    num = (N1 * D2) - (N2 * D1);
                    den = D1 * D2;
                }
                case "*" -> {
                    num = N1 * N2;
                    den = D1 * D2;
                }
                case "/" -> {
                    num = N1 * D2;
                    den = N2 * D1;
                }
            }


            int divider = mdc(num, den);

            int numSimp = num / divider;
            int denSimp = den / divider;

            System.out.println(num +"/"+den+ " = "+ numSimp+" / "+denSimp);

        }

    }

}
