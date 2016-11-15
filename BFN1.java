package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/BFN1/ */


public class BFN1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();       //ile liczb
        int number;
        for (int i = 0; i < t; i++) {
            number = in.nextInt();
            int tries = 0;
            while(!isPalindrom(number)) {
                reverse(number);
                number += reverse(number);
                tries++;
            }
            System.out.println(number + " " + tries);
        }
    }

    private static int reverse(int num) {
        int reversedNumber = 0;
        while(num != 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num = num / 10;
        }
        return reversedNumber;
    }

    private static boolean isPalindrom(int num) {
        if(reverse(num) == num) return true;
        else return false;
    }
}