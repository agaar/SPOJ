package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PP0601B/ */

public class PP0601B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++ ) {
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            for(int j = 2; j < n; j++) {
                if(j % x == 0 && j % y != 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
