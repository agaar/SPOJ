package com.company;

/** http://pl.spoj.com/problems/WSEGA/ */

import java.util.Scanner;

public class WSEGA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt(); 
            int sumaNozek = 0;
            for(int j = 0; j < n; j++) {
                int nozek = in.nextInt();
                sumaNozek += nozek;
            }
            System.out.println(n - 1 + sumaNozek);
        }
    }
}
