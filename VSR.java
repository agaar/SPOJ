package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/VSR/ */

public class VSR {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            System.out.println(2*v1*v2/(v1+v2));
        }
    }
}
