package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/JZLICZ/ */

public class JZLICZ {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String[] line = new String[N];
        String allLines = "";

        for(int i = 0; i < N; i++) {
            line[i] = in.nextLine();
            allLines+=line[i];
        }

        int countJ;
        for(char j = 'a'; j <= 'z'; j++) {
            countJ = 0;
            for(int k = 0; k < allLines.length(); k++ ) {
                if(allLines.charAt(k) == j) {
                    countJ++;
                }
            }
            if(countJ > 0)System.out.println(j + " " + countJ);
        }
        for(char j = 'A'; j <= 'Z'; j++) {
            countJ = 0;
            for(int k = 0; k < allLines.length(); k++ ) {
                if(allLines.charAt(k) == j) {
                    countJ++;
                }
            }
            if(countJ > 0)System.out.println(j + " " + countJ);
        }
    }
}
