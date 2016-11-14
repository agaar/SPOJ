package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PP0602A/ */

public class PP0602A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int []numbers = new int[n];

            for(int j = 0; j < n; j++) {
                numbers[j] = in.nextInt();
            }
            for(int j = 1; j < n; j=j+2) {
                System.out.print(numbers[j]+ " ");
            }
            for(int j = 0; j < n; j=j+2) {
                System.out.print(numbers[j]+ " ");
            }
            System.out.println();
        }
    }
}
