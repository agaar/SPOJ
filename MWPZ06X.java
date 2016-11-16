package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/MWPZ06X/ */

public class MWPZ06X {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        for(int i = 0; i < D; i++) {
            int k = scanner.nextInt();
            System.out.println(k*k);
        }
    }
}
