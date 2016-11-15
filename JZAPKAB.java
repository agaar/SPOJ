package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/JZAPKAB/ */

public class JZAPKAB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String wyraz = in.next();
        int rok = 0;
        int wartosc = 0;
        for(int i = 0; i < wyraz.length(); i++) {
            char litera = wyraz.charAt(i);
            switch(litera){
                case 'a': wartosc = 1; break;
                case 'b': wartosc = 2;  break;
                case 'c': wartosc = 3;  break;
                case 'd': wartosc = 4;  break;
                case 'e': wartosc = 5;  break;
                case 'f': wartosc = 6;  break;
                case 'g': wartosc = 7;  break;
                case 'h': wartosc = 8;  break;
                case 'i': wartosc = 9;  break;
                case 'k': wartosc = 10;  break;
                case 'l': wartosc = 20;  break;
                case 'm': wartosc = 30;  break;
                case 'n': wartosc = 40;  break;
                case 'o': wartosc = 50;  break;
                case 'p': wartosc = 60;  break;
                case 'q': wartosc = 70;  break;
                case 'r': wartosc = 80;  break;
                case 's': wartosc = 90;  break;
                case 't': wartosc = 100;  break;
                case 'v': wartosc = 200;  break;
                case 'x': wartosc = 300;  break;
                case 'y': wartosc = 400;  break;
                case 'z': wartosc = 500;  break;
            }
            rok += wartosc;
        }
        System.out.println(rok);
    }
}
