import java.util.Scanner;

/**
 * Created by User on 2016-10-07.
 * http://pl.spoj.com/problems/ETI06F1/
 */

class ETI06F1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double d = in.nextDouble();
        final double PI = 3.141592654;
        double radius = Math.sqrt(r*r-d*d/4);
        double area = PI*radius*radius;
        System.out.println(area);
    }
}

