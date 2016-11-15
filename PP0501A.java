package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PP0501A/ */

public class PP0501A {

    public static void main(String[] args) throws java.lang.Exception {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i<t ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(nwd(a,b));
        }
    }

    static int nwd(int a, int b) {
        while (a!=b) {
            if(a>b) a=a-b;
            else    b=b-a;
        }
        return a;
    }
}
