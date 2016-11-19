import java.util.Scanner;

/**
 * Created by User on 2016-11-03.
 * http://pl.spoj.com/problems/PROGC05/
 */
public class PROGC05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String a = in.next();
            char letter = a.charAt(0);
            String word = in.next();
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) != letter) System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}
