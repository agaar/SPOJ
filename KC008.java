package com.company;

/** http://pl.spoj.com/problems/KC008/ */

import java.util.Scanner;

public class KC008 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sumaWszystkich = 0;
        while(in.hasNext()) {
            long sumaZestawu = 0;

            long liczba = 0;
            do{
                liczba = in.nextLong();
                sumaZestawu += liczba;

            }while( liczba != 0);

            System.out.println(sumaZestawu);
            sumaWszystkich += sumaZestawu;
        }
        System.out.println(sumaWszystkich);
    }
}
