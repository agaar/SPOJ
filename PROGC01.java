package com.company;

/** http://pl.spoj.com/problems/PROGC01/ */

import java.util.Scanner;

public class PROGC01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linii = 0;
        while(in.hasNext()) {
            in.nextLine();
            linii++;
        }
        System.out.println(linii);
    }
}
