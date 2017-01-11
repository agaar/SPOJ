package com.company;

import java.util.Scanner;

/**
 * http://pl.spoj.com/problems/PICIRC/
 */

public class PICIRC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        int radius = sc.nextInt();
        int numberOfPoints = sc.nextInt();

        for (int i = 0; i < numberOfPoints; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            double distance = Math.sqrt(Math.pow((x - x0), 2) + Math.pow((y - y0), 2));

            if (distance == radius) {
                System.out.println("E");
            } else if (distance < radius) {
                System.out.println("I");
            } else System.out.println("O");
        }
    }
}
