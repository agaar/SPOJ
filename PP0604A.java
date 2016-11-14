import java.util.Scanner;

/**
 * Created by User on 2016-10-17.
 * http://pl.spoj.com/problems/PP0604A/
 *
 */
public class PP0604A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int[] numbers = new int[n];
            float sum = 0, average = 0;
            for(int j = 0; j < n; j++){
                numbers[j] = in.nextInt();
                sum += numbers[j];
            }
            average = sum / n;
            float min = sum;
            int closest = 0;
            for(int j = 0; j < n; j++) {
                if(Math.abs(numbers[j] - average) < min) {
                    min = Math.abs(numbers[j] - average);
                    closest = numbers[j];
                }
            }
            System.out.println(closest);
        }
    }
}
