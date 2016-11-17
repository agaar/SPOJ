package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/BINOMS/ */

public class BINOMS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();               //liczba testow
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            double result = 1;
            int[] tab1 = new int[n];
            int[] tab2 = new int[n];
            int[] tab3 = new int[n];

            for (int j = n; j > 0; j--) {
                tab1[j-1] = j;
                if (j <= k) tab2[j-1] = j;
                else tab2[j-1] = 1;
                if (j <= (n - k)) tab3[j-1] = j;
                else tab3[j-1] = 1;

                result = result * tab1[j-1] / (tab2[j-1] * tab3[j-1]);
            }
            int numberOfSubsets = (int)(result+0.5);
            System.out.println(numberOfSubsets);
        }
    }
}
