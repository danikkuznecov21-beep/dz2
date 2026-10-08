package dz2;

import java.util.Scanner;

public class ggg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        boolean res = (x >= -2 && x <= 3) || (x >= 6 && x <= 9);
        System.out.println(!res);
        // задача номер 3
    }
}
