package com.company;

import java.util.Arrays;
import java.util.Scanner;

/** http://pl.spoj.com/problems/PP0506A/ */

public class PP0506A  {

    public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();       //liczba punktow
            Point[] point = new Point[n];
            for(int j = 0; j < n; j++) {
                point[j] = new Point();
                point[j].setNazwa(in.next());
                point[j].setX(in.nextInt());
                point[j].setY(in.nextInt());
                point[j].setDistance();
                point[j].getDistance();
            }
            Arrays.sort(point);
            for(int j = 0; j < n; j++) {
                System.out.println(point[j].getNazwa() + " " + point[j].getX() + " " + point[j].getY() );       //wyswietla wspolrzedne
            }
            System.out.println();
        }
    }
}

class Point implements Comparable<Point> {

    private String nazwa = "";
    private int x = 0;
    private int y = 0;
    private double distance;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance() {
        this.distance = calculateDistance(getX(), getY());
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(int x, int y) {
        this.x = x;
        this.y = y;
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public int compareTo(Point o) {
        return Double.compare(this.distance, o.distance);
    }
}






