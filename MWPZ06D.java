package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/MWPZ06D/ */

public class MWPZ06D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        for(int i = 0; i < D; i++) {
            int L = in.nextInt();       //liczba osób w klasie
            int C = in.nextInt();       //liczba cukierków

            if(L==1 && C==0) System.out.println("NIE");
            else if(L==1 && C!=0) System.out.println("TAK");
            else if(C < L-1) System.out.println("TAK");
            else if(C % (L-1) == 0) System.out.println("NIE");
            else System.out.println("TAK");
        }
    }
}
