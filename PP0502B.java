package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PP0502B/ */

public class PP0502B {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int [] tablica = new int[n];
            for(int j = 0; j < n; j++) {
                tablica[j] = in.nextInt();
            }
            for(int k = n - 1; k>=0; k--) {
                System.out.print(tablica[k]+" ");
            }
        }
    }
}
