package com.company;

import java.util.Scanner;

//http://pl.spoj.com/problems/POL/

public class POL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            String n = scanner.next();
            for(int j = 0; j < n.length()/2; j++) {
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }
}
