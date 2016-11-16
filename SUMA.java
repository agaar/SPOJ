package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/SUMA/ */

public class SUMA {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int sum = 0;
        while(in.hasNext()) {
            sum += in.nextInt();
            System.out.println(sum);
        }
    }
}
