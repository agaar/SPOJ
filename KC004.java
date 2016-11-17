import java.util.Scanner;

/**
 * Created by User on 2016-10-13.
 * http://pl.spoj.com/problems/KC004/
 */
public class KC004 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int countedNumber = in.nextInt();
            int sequenceLength = in.nextInt();
            int counter = 0;
            int[] sequence = new int[sequenceLength];
            for(int i = 0; i < sequenceLength; i++) {
                sequence[i] = in.nextInt();
                if(countedNumber == sequence[i]) counter++;
            }
            System.out.println(counter);
        }
    }
}
