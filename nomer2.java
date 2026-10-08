package dz2;

import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        boolean res = x >=-3 && x<=5 || x >= 9 && x <= 15 ;
        System.out.println(res);

    }
}