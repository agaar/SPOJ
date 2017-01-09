package com.company;

import java.io.*;

public class NIEKOLEJ {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        if(!isPossible(n)) System.out.println("NIE");
        else {
            for(int i = 1; i <= n; i = i + 2) {
                sb.append(i).append(" ");
            }
            for(int i = 0; i <=n; i = i + 2) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static boolean isPossible(int n) {
        if (n == 0) return true;
        else if (n < 3) return false;
        return true;
    }
}
