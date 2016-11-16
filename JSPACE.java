package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/JSPACE/ */

public class JSPACE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String text = in.nextLine();
            char[] table = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                table[i] = text.charAt(i);
            }

            for (int i = 0; i < table.length; i++) {
                if (i+1<table.length && table[i] == ' ' && table[i+1] != ' ') {
                    System.out.print(Character.toUpperCase(table[i + 1]));
                    i++;
                }
                else if(i+1<table.length && table[i] == ' ' && table[i+1] == ' ' ) i++;
                else System.out.print(table[i]);
            }
            System.out.println();
        }
    }
}