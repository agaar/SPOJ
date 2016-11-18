package com.company;

/** http://pl.spoj.com/problems/KC001/ */

import java.util.Scanner;

public class KC001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;
        System.out.println(sum);
    }
}
