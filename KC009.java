package com.company;

/** http://pl.spoj.com/problems/KC009/ */

import java.util.Scanner;

public class KC009 {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        while(in.hasNext()) {

            String word = in.next();
            char [] table = new char[word.length()];

            for(int i = 0; i < word.length(); i++) {
                table[i]=word.charAt(i);
            }

            for(int i = word.length()-1; i >= 0; i--) {
                System.out.print(table[i]);
            }
            System.out.println();
        }
    }
}
