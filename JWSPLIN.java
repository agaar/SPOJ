package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/JWSPLIN/ */

public class JWSPLIN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int x3 = in.nextInt();
            int y3 = in.nextInt();

            if((x2 - x1)*(y3-y1)==(y2-y1)*(x3-x1)) System.out.println("TAK");
            else System.out.println("NIE");
        }
    }
}
