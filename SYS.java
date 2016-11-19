package com.company;

/** http://pl.spoj.com/problems/SYS/ */

import java.util.Scanner;

public class SYS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();                                               //number of tests

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();                                            //decimal number
            System.out.println(convertToHexadecimal(n) + " " + convertToUndenary(n));
        }
    }

    private static String convertToHexadecimal(int decimalNum) {
        String digits = "0123456789ABCDEF";
        if (decimalNum == 0) return "0";
        String hex = "";
        while (decimalNum > 0) {
            int digit = decimalNum % 16;                
            hex = digits.charAt(digit) + hex;           // string concatenation
            decimalNum = decimalNum / 16;
        }
        return hex;
    }

    private static String convertToUndenary(int decimalNum) {
        String digits = "0123456789A";
        if (decimalNum == 0) return "0";
        String und = "";
        while (decimalNum > 0) {
            int digit = decimalNum % 11;
            und = digits.charAt(digit) + und;           // string concatenation
            decimalNum = decimalNum / 11;
        }
        return und;
    }
}
