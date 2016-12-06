/** http://pl.spoj.com/problems/WI_SZYFR/ */

import java.util.Scanner;

public class WI_SZYFR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = in.nextLine();
        String key = in.nextLine();
        String message = in.nextLine();

        if(task.equals("SZYFRUJ"))  System.out.println(encode(message, key));
        else System.out.println(crack(message, key));
    }

    private static String crack(String message, String key) {
        String cracked="";
        for(int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            int index = ALPHABET.indexOf(letter);
            char newLetter = ALPHABET.charAt((ALPHABET.length() + index - Character.getNumericValue(
                                                                    key.charAt(i % key.length())))%ALPHABET.length());
            cracked += newLetter;
        }
        return cracked;
    }
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String encode(String message, String key) {
        String encoded="";
        for(int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            int index = ALPHABET.indexOf(letter);
            char newLetter = ALPHABET.charAt((index + Character.getNumericValue(key.charAt(i % key.length()))));
            encoded += newLetter;
        }
        return encoded;
    }
}
