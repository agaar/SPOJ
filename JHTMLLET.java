import java.util.Scanner;

/**
 * Created by User on 2016-10-19.
 * http://pl.spoj.com/problems/JHTMLLET/
 */
public class JHTMLLET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            char[] nowy = new char[line.length()];

            for (int i = 0; i < line.length(); i++) {
                nowy[i] = line.charAt(i);
            }

            for(int i = 0; i < line.length(); i++) {
                if(nowy[i]=='<') {
                    while(nowy[i] != '>') {
                        System.out.print(Character.toUpperCase(nowy[i]));
                        i++;
                    }
                    System.out.print(">");
                }
                else System.out.print(nowy[i]);
            }
            System.out.println();
        }
    }
}

