package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/JSZYCER/ */

public class JSZYCER {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String words = in.nextLine();

            char[] wejscie = new char[words.length()];
            for(int i = 0; i < words.length(); i++) {
                wejscie[i]=words.charAt(i);         //uzupelnia tablicę znakami ze stringa
            }

            szyfruj(wejscie, words);
        }
    }

    private static void szyfruj(char[] a, String w) {
        for(int i = 0; i < w.length(); i++) {
            if (a[i] == 'Z') System.out.print('C');
            else if (a[i] == 'Y') System.out.print('B');
            else if (a[i] == 'X') System.out.print('A');
            else if (a[i] >= 'A' && a[i] < 'X') System.out.print((char) (a[i] + 3));
            else System.out.print(a[i]);
        }
        System.out.println();
    }
}