package com.company;

import java.util.*;
import java.lang.*;

/** http://pl.spoj.com/problems/RNO_DOD/ */

class RNO_DOD {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0; i<t; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            for(int j=0; j<n; j++) {
                sum = sum + scanner.nextInt();
            }
            System.out.println(sum);
        }
    }
}