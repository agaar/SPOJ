package com.company;

import java.io.BufferedReader;
import java.util.Scanner;

/** http://pl.spoj.com/problems/CALC/ */

public class CALC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            //wczytanie znaku
            String c = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(c.startsWith("+")) {
                System.out.println(a + b);
            }
            else if(c.startsWith("-")) {
                System.out.println(a - b);
            }
            else if(c.startsWith("*")) {
                System.out.println(a * b);
            }
            else if(c.startsWith("/")) {
                System.out.println(a / b);
            }
            else {
                System.out.println(a % b);
            }
        }

    }

}
