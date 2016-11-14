package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PRZEDSZK/ */

public class PRZEDSZK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(NWW(a,b));
        }
    }

    static int NWW(int liczba1, int liczba2) {
        return liczba1*liczba2/NWD(liczba1, liczba2);
    }

    static int NWD(int liczba1, int liczba2)
    {
        int pomoc;
        while(liczba2!=0)
        {
            pomoc = liczba2;
            liczba2 = liczba1%liczba2;
            liczba1 = pomoc;
        }
        return liczba1;
    }

}
