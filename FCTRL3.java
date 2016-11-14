package com.company;

import java.util.Scanner;

/** pl.spoj.com/problems/FCTRL3/ */

public class FCTRL3 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        for(int i = 0; i < D; i++) {
            long n = in.nextLong();
            int k = (int) n;

            switch(k)
            {
                case 0:
                    System.out.println("0 1");
                    break;
                case 1: System.out.println("0 1");
                    break;
                case 2: System.out.println("0 2");
                    break;
                case 3: System.out.println("0 6");
                    break;
                case 4: System.out.println("2 4");
                    break;
                case 5: System.out.println("2 0");
                    break;
                case 6: System.out.println("2 0");
                    break;
                case 7: System.out.println("4 0");
                    break;
                case 8: System.out.println("2 0");
                    break;
                case 9: System.out.println("8 0");
                    break;
            }
            if(n>9) System.out.println("0 0");
        }
    }
}
