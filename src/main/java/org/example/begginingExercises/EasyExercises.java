package org.example.begginingExercises;

public class EasyExercises {

    public static String reverse(String s){

        if(s.length() <= 1){
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);

        // caso base
//        if(s.length() <= 1)
//            return s;
//
//        // pega ultimo caractere
//        char ultimo = s.charAt(s.length() - 1);
//
//        // resto da string
//        String resto = s.substring(0, s.length() - 1);
//
//        // chamada recursiva
//        return ultimo + reverse(resto);
//

    }

    public static boolean isPalindrome(String s){

        s = s.toLowerCase();

        if(s.length() <= 1){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));

    }

    public static boolean isPalindromeNum(int num){

        if(num < 0){
            return true;
        }

        int divisor = 1;

        while(num / divisor >= 10){
            divisor *= 10;
        }

        return verify(num, divisor);

    }

    public static boolean verify(int num, int divisor){

        if(num < 10){
            return true;
        }

        int firsDigit = num / divisor;
        int lastDigit = num % 10;

        if(firsDigit != lastDigit){
            return false;
        }

        int newNum = (num % divisor) / 10;
        int newDivisor = divisor / 100;

        return verify(newNum, newDivisor);

    }

    public static int sumDigits(int num){

        if(num < 10){
            return num;
        }

        return sumDigits(num / 10) + num % 10;

    }

    public static int countDigits(int num){

        if(num < 10){
            return 1;
        }

        return countDigits(num / 10) + 1;

    }







}
