package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/STOS/ */

public class STOS {

    public static void main(String[] args) {
        int[] stos = new int[10];
        int counter = 0;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String s = in.next();
            char sign = s.charAt(0);
            if(sign=='+' ) {
                int number = in.nextInt();
                if(counter != 10) {
                    System.out.println(":)");
                    stos[counter]=number;
                    counter++;
                }
                else System.out.println(":(");
            } else {    //if sign == '-'
                if(counter != 0) {
                    System.out.println(stos[counter-1]);
                    counter--;
                }
                else System.out.println(":(");
            }
        }
    }
}
