package com.company;

import java.util.Scanner;

/** http://pl.spoj.com/problems/PRIME_T/ */

public class PRIME_T {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            int k = scanner.nextInt();
            if(k==2 || k==3 || k==5 || k==7 || k==11 || k==13 || k==17 ||k==19 || k==23 ||k==29 || k==31
                    ||k==37 || k==41 ||k==43 || k==47 ||k==53 || k==59 ||k==61 || k==67 ||k==71 || k==73
                    ||k==79 || k==83 ||k==89 || k==97 ||k==101 || k==103 ||k==107 || k==109 ||k==113) {
                System.out.println("TAK");
            }
            else if(k==1 || k%2==0 || k%3==0 || k%5==0 || k%7==0 || k%11==0 || k%13==0 || k%17==0 || k%19==0 || k%23==0
                    || k%29==0 || k%31==0 || k%37==0 || k%41==0 || k%43==0 || k%47==0 || k%53==0 || k%59==0
                    || k%61==0 || k%67==0 || k%71==0 || k%73==0 || k%79==0 || k%83==0 || k%89==0 || k%97==0
                    ||  k%101==0 || k%103==0 || k%107==0 || k%109==0 || k%113==0 ) {
                System.out.println("NIE");
            }
            else {
                    System.out.println("TAK");
                }
            }
        }
    }
