package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PTROL/ */

public class PTROL {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] tablica = new int[n];
            
	    for(int j = 0; j < n; j++) {
                tablica[j]=scanner.nextInt();
            }
            int memory = tablica[0];

            for(int k = 0; k < n-1; k++) {
                tablica[k]=tablica[k+1];
                System.out.print(tablica[k] + " ");
            }
            System.out.println(memory);
        }
    }
}
